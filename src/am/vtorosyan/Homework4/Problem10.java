package am.vtorosyan.Homework4;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        System.out.println("Input an integer n and program will calculate n-th fibonacci number.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        int pv = 0;
        int nxt = 1;
        int fib = 0;
        int i = 1;
        while (i <= n) {
            //System.out.print(n1 + " ");
            fib = pv + nxt;
            pv = nxt;
            nxt = fib;
            i++;
        }
        System.out.println("Output: fib(" + n + ") = " + pv);
    }
}
