package other.l67_add_binary;

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
