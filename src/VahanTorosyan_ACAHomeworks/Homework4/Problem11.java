package VahanTorosyan_ACAHomeworks.Homework4;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        System.out.println("Input an integer n and program will check if n is a prime number.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        int i = 2;
        boolean condition = false;
        if (n <= 1) {
            System.out.println("Please enter any positive numbers from 2");

        } else {
            while (i < n / 2) {
                if (n % i == 0) {
                    condition = true;
                    break;
                }
                i++;
            }

            if (!condition)
                System.out.println(n + " is a prime number.");
            else
                System.out.println(n + " is not a prime number.");
        }
    }
}
