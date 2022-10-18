// Check if the string is Palindrome or not using Recursion

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "abca";
        System.out.println(isPalindrome(str, 0, str.length() - 1));
    }

    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        return (str.charAt(start) == str.charAt(end)) && isPalindrome(str, start + 1, end - 1);
    }
}