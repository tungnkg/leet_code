package l242_valid_anagram;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(solve1("anagram", "nagaram")); // true
        System.out.println(solve1("rat", "car")); // false

        System.out.println(solve2("anagram", "nagaram")); // true
        System.out.println(solve2("rat", "car")); // false
    }

    /*
        * Time complexity: O(n)
        * use map to store the count of each character in s and t
        * if the count of each character in s and t are the same, return true
        * otherwise, return false
    * */
    public static boolean solve1(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); ++i){
            Character charS = s.charAt(i);
            Character charT = t.charAt(i);
            map.put(charS, map.getOrDefault(charS,  0) + 1);
            map.put(charT, map.getOrDefault(charT,  0) - 1);
        }

        for(Integer count: map.values()){
            if(count != 0) return false;
        }
        return true;
    }

    /*
    *   Time complexity: O(n)
    *   use an array to store the count of each character in s
    *   if the count of each character in s and t are the same, return true
    *   otherwise, return false
    * */
    public static boolean solve2(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] charArr = new int[26];
        for(int i = 0; i < s.length(); ++i){
            charArr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); ++i){
            if(charArr[t.charAt(i) - 'a'] == 0) return false;
            charArr[t.charAt(i) - 'a']--;
        }
        return true;
    }
}
