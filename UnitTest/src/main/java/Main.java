import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(11,22));
        System.out.println(isABucket("bucket"));
        System.out.println(containsO("word"));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static boolean isABucket(String word){
        return (Objects.equals(word, "Bucket"));
    }
    public static boolean containsO(String word2){
        return word2.contains("o");
    }
}