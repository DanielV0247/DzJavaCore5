import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static String[] words;
    @BeforeAll
        static void beforeAll(){
        words = new String[]{
                "Buket",
                "Bucet",
                "Bouquet",
        };
    }
    @Test
    void sum() {
        int number1 = 4;
        int number2 = 8;
        int trueResult = 12;


        int result = Main.sum(number2, number1);

        Assertions.assertEquals(trueResult, result);

    }

    @Test
    void isABucket() {
        for (String word : words) {
            Assertions.assertFalse(Main.isABucket(word));
        }

    }

    @ParameterizedTest
    @ValueSource(strings = {
            "randomly",
            "generated",
            "words"
    })
    void containsO(String words2) {
        Assertions.assertTrue(Main.containsO(words2));
    }
}