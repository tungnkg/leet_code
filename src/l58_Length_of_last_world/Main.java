package l58_Length_of_last_world;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("   fly me   to   the moon  "));
    }

    public static int solution(String s) {
        List<String> list = List.of(s.split(" "));
        return list.stream().filter(e -> !e.isEmpty()).reduce((first, second) -> second).orElse("").length();
    }
}
