package graph;

import java.util.ArrayDeque;
import java.util.Deque;

public class FloodFill {

    // Breadth First Search (Iteration) - Time Complexity: O(m.n) ; Space Complexity: O(m.n) ,
    // 'm' is the number of rows and 'n' is the number of columns
    // BFS can require more memory than DFS as BFS has to keep track of all the nodes on the same level (width), while
    // DFS only has to keep track of the nodes in a chain from the top to the bottom (current path; depth)
    // LeetCode - Runtime: 2 ms ; Memory : 44.1 MB
    public static int[][] solutionBFS(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) { return image; }

        int numOfRows = image.length;
        int numOfCols = image[0].length;
        Deque<Integer[]> queue = new ArrayDeque<>();

        queue.add(new Integer[]{sr, sc});

        while(!queue.isEmpty()) {
            Integer[] currentPixelIndex = queue.remove();
            Integer i = currentPixelIndex[0];
            Integer j = currentPixelIndex[1];
            Integer currentPixelValue = image[i][j];

            image[i][j] = color;

            if(i-1 >= 0 && image[i-1][j] == currentPixelValue && image[i-1][j] != color) {
                queue.add(new Integer[]{i-1, j}); // topPixel
            }

            if(j-1 >= 0 && image[i][j-1] == currentPixelValue && image[i][j-1] != color) {
                queue.add(new Integer[]{i, j-1}); // leftPixel
            }

            if(i+1 < numOfRows && image[i+1][j] == currentPixelValue && image[i+1][j] != color) {
                queue.add(new Integer[]{i+1, j}); // bottomPixel
            }

            if(j+1 < numOfCols && image[i][j+1] == currentPixelValue && image[i][j+1] != color) {
                queue.add(new Integer[]{i, j+1}); // rightPixel
            }
        }
        return image;
    }

    // Depth First Search (Recursion) - Time Complexity: O(m.n) ; Space Complexity: O(m.n) ,
    // 'm' is the number of rows and 'n' is the number of columns
    // LeetCode - Runtime: 0 ms ; Memory : 43.9 MB
    public static int[][] solutionDFS(int[][] image, int sr, int sc, int color) {
        colorFill(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    private static void colorFill(int[][] image, int rowIndex, int colIndex, int color, int startPixelValue) {
        if(rowIndex < 0 || rowIndex >= image.length || colIndex < 0  || colIndex >= image[0].length) {
            return;
        }

        if(image[rowIndex][colIndex] == color || image[rowIndex][colIndex] != startPixelValue) {
            return;
        }

        image[rowIndex][colIndex] = color;

        colorFill(image, rowIndex-1, colIndex, color, startPixelValue);  // top pixel
        colorFill(image, rowIndex, colIndex-1, color, startPixelValue);  // left pixel
        colorFill(image, rowIndex+1, colIndex, color, startPixelValue); // bottom pixel
        colorFill(image, rowIndex, colIndex+1, color, startPixelValue); // right pixel
    }
}
