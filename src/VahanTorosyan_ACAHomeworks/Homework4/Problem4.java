package VahanTorosyan_ACAHomeworks.Homework4;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers and program will calculate the result for 1-th number power of 2-nd");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1-st number : ");
        int x = scanner.nextInt();
        System.out.print("Enter 2-nd number : ");
        int y = scanner.nextInt();
        double result = Math.pow(x, y);
        System.out.println("Output: " + x + "^" + y + " = " + result);

    }
}
