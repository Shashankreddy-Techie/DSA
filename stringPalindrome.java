public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        boolean isPalindrome = isPalindrome(input);
        System.out.println("Is the input a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lower case
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
