package Series;

public class FibonacciSeries {
    public void printFibonacci(int n) {
        System.out.println("Fibonacci Series:");
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
