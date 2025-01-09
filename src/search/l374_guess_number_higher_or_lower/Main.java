package search.l374_guess_number_higher_or_lower;

public class Main {
    public static void main(String[] args) {

    }
    public static int guessNumber(int n) {
        int l = 1;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (guess(mid) == 0) return mid;
            if (guess(mid) == 1) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    private static int guess(int mid) {
        return 0;
    }
}
