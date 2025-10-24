/*Create a package named Series having three different classes to print series:
a. Prime numbers b. Fibonacci series c. Squares of numbers
Write a program to generate ‘n’ terms of the above series. */


import Series.*;
import java.util.Scanner;

public class MainSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        PrimeSeries ps = new PrimeSeries();
        FibonacciSeries fs = new FibonacciSeries();
        SquareSeries ss = new SquareSeries();

        System.out.println("\n--- Generated Series ---");
        ps.printPrimes(n);
        fs.printFibonacci(n);
        ss.printSquares(n);

        sc.close();
    }
}



