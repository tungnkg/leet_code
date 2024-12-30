package l344_reverse_string;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solve4(s);
        System.out.println(s);
    }

    public static void solve1(char[] s) {
        int n = s.length;
        for(int i = 0; i < n/2; ++i){
            char tmp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = tmp;
        }
    }

    private static void solve2(char[] s){
        int n = s.length;
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }

    private static void solve3(char[] s, int l, int r){
        if(l >= r) return;
        char tmp = s[l];
        s[l] = s[r];
        s[r] = tmp;
        solve3(s, l+1, r-1);
    }

    public static void solve4(char[] s){
        Stack<Character> stack = new Stack<>();
        for(char c : s){
            stack.push(c);
        }
        for(int i = 0; i < s.length; i++){
            s[i] = stack.pop();
        }
    }
}
