import graph.FloodFill;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("FloodFill");

        int[][] image = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};

        Arrays.stream(FloodFill.solutionBFS(image, 1, 1, 2))
                .forEach((row) -> {
                    System.out.println();
                    Arrays.stream(row).forEach((e) -> System.out.print(e + " "));
                });

        System.out.println();

        Arrays.stream(FloodFill.solutionDFS(image, 1, 1, 2))
                .forEach((row) -> {
                    System.out.println();
                    Arrays.stream(row).forEach((e) -> System.out.print(e + " "));
                });
    }
}