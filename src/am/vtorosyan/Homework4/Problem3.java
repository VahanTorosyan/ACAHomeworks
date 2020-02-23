package am.vtorosyan.Homework4;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println("Enter any number and program will print the multiplication table up to 10");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int num = scanner.nextInt();
        int result;
        int i = 1;
        while (i <= 10) {
            result = num * i;
            System.out.println(num + " * " + i + " = " + result);
            i++;
        }
    }
}
