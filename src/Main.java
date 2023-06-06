import array.BestTimeToBuySellStock;

public class Main {
    public static void main(String[] args) {
        System.out.println("BestTimeToBuySellStock");

        System.out.println(BestTimeToBuySellStock.solution(new int[]{7,1,5,3,6,4}));
        System.out.println(BestTimeToBuySellStock.solutionLFPointer(new int[]{7,6,4,3,1}));
    }
}