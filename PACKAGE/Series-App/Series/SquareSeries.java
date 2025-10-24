package Series;

public class SquareSeries {
    public void printSquares(int n) {
        System.out.println("Square Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }
}
