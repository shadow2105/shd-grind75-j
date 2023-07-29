import binarysearch.BinarySearch;

public class Main {
    public static void main(String[] args) {
        System.out.println("BinarySearch");

        System.out.println(BinarySearch.solution(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(BinarySearch.solution(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}