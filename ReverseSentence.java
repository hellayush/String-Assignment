public class ReverseSentence {
    public static void main(String[] args) {
        String input = "Think Twice";
        String output = reverseSentence(input);
        System.out.println("Input : " + input);
        System.out.println("Output : " + output);
    }
    
    public static String reverseSentence(String input) {
        String[] words = input.split("\\s+"); 
        StringBuilder reversedSentence = new StringBuilder();
        
        for (String word : words) {
            String reversedWord = reverseString(word); 
            reversedSentence.append(reversedWord).append(" ");
        }
        
        return reversedSentence.toString().trim(); 
    }
    
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i)); 
        }
        return reversed.toString();
    }
}
