package l13_roman_to_int;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }

    public static int romanToInt(String s) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("I", 1);
        maps.put("IV", 4);
        maps.put("V", 5);
        maps.put("IX", 9);
        maps.put("X", 10);
        maps.put("XL", 40);
        maps.put("L", 50);
        maps.put("XC", 90);
        maps.put("C", 100);
        maps.put("CD", 400);
        maps.put("D", 500);
        maps.put("CM", 900);
        maps.put("M", 1000);
        String[] strings = s.split("");
        if (strings.length == 1) return maps.get(strings[0]);
        int result = 0;
        int i = 0;
        while (i < strings.length - 1) {
            if (maps.get(strings[i]) < maps.get(strings[i + 1])) {
                result += maps.get(strings[i] + strings[i + 1]);
                i += 2;
                if (i == strings.length - 1) {
                    result += maps.get(strings[i]);
                }
            } else {
                result += maps.get(strings[i]);
                if (i == strings.length - 2) {
                    result += maps.get(strings[i + 1]);
                }
                i++;
            }
        }
        return result;
    }
}
