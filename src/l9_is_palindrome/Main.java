package l9_is_palindrome;

public class Main {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int result = 0;
        int original = x;
        while (x > 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        return result == original;
    }
}
