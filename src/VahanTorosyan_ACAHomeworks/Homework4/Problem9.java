package VahanTorosyan_ACAHomeworks.Homework4;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        System.out.println("Input an integer and program will calculate factorial.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        long n = scanner.nextLong();
        int i = 1;
        long result = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        System.out.println("Output: " + n + "!" + " = " + result);
    }
}
