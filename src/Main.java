import array.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("TwoSum");

        Arrays.stream(TwoSum.solution(new int[]{2, 7, 11, 15}, 9)).forEach((e) -> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(TwoSum.solutionMap(new int[]{2, 7, 11, 15}, 9)).forEach((e) -> System.out.print(e + " "));
    }
}