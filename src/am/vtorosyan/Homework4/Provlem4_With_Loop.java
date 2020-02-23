package am.vtorosyan.Homework4;

import java.util.Scanner;

public class Provlem4_With_Loop {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers and program will calculate the result for 1-th number power of 2-nd");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1-st number : ");
        int x = scanner.nextInt();
        System.out.print("Enter 2-nd number : ");
        int y = scanner.nextInt();
        int result = 1;
        int i = y;
        while (i != 0) {
            result *= x;
            i--;
        }
        System.out.println("Output: " + x + "^" + y + " = " + result);
    }
}
