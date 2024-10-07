package DSA;
import java.util.List;
import java.util.ArrayList;

public class ExtractWords {
    

   
        public static void main(String[] args) {
            String input = "apple5$mango5$pk1"; // Example input string
           String[] validWords = extractValidWords(input);

           for (String string : validWords) {
            System.out.println(string); // Output: [apple, mango]

           }
        }
    
        public static String[] extractValidWords(String input) {
            List<String> validWords = new ArrayList<>();
            String[] parts = input.split("\\$"); // Split by the dollar sign ($)
    
            // Ordinary for loop instead of for-each loop
            for (int i = 0; i < parts.length; i++) {
                String part = parts[i];
                int len = part.length();
                // Extract the number at the end of each word and compare it with the word length
                int expectedLength = Character.getNumericValue(part.charAt(len - 1));
                String word = part.substring(0, len - 1); // Get the word without the length digit
    
                if (word.length() == expectedLength) {
                    validWords.add(word); // Add valid words to the list
                }
            }
    
            return validWords.toArray(new String[0]);
        }
    }
    


