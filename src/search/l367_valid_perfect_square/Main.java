package search.l367_valid_perfect_square;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(14));
    }

    public static boolean isPerfectSquare(int num) {
        long l = 1;
        long r = num;
        while(l <= r){
            long mid = l + (r -l) /2;
            if(mid * mid == num) return true;
            else if(mid * mid > num) r = mid - 1;
            else l = mid + 1;
        }
        return false;
    }
}
