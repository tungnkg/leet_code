package search.l278_first_bad_version;

public class Main {
    public static void main(String[] args) {

    }

    public static int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while(l < r){
            int mid = l + (r  - l) /2;
            if(!isBadVersion(mid)){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return l;
    }

    private static boolean isBadVersion(int mid) {
        return false;
    }
}
