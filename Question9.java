import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Count the words
        int wordcount = words.length;

        // Find the longest word
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Output the results
        System.out.println("Word Count: " + wordcount);
        System.out.println("Longest Word: " + longestWord);

        scanner.close();
    }
}
