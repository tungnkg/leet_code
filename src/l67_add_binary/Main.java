package l67_add_binary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("1010", "1011"));
    }

    public static String solution(String stringA, String stringB) {
        int a = Integer.parseInt(stringA, 2);
        int b = Integer.parseInt(stringB, 2);
        int sum = a + b;
        return Integer.toBinaryString(sum);
    }
}
