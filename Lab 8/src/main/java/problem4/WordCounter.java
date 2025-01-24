package problem4;

import java.util.List;

public class WordCounter {
    public static void main(String[] args) {
        List<String> words = List.of(
                "apple", "banana", "cherry", "date", "elderberry", "fig", "grape",
                "honeydew", "kiwi", "lemon", "mango", "orange", "papaya",
                "quince", "raspberry", "strawberry", "tangerine", "vanilla",
                "watermelon", "xigua", "zucchini", "apricot", "blueberry"
        );
        char c = 'a';
        char d = 'e';
        int len = 5;

        System.out.println("Number of words with length " + len + " that contain " + c + " but not " + d + ": " + new WordCounter().countWords(words, c, d, len));
    }
    public int countWords(List<String> words, char c, char d, int len) {
        String charC = String.valueOf(c);
        String charD = String.valueOf(d);

        return (int) words.stream()
                .filter(word -> word.length() == len)
                .filter(word -> word.contains(charC))
                .filter(word -> !word.contains(charD))
                .count();
    }
}
