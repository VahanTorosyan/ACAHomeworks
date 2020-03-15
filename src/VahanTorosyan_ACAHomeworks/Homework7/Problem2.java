package VahanTorosyan_ACAHomeworks.Homework7;

import java.util.Scanner;

public class Problem2 {
    static int FunPercent(int a, int b){
        float result = 0;
        result = ((b - a) * 100) /a;
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println("Please enter two numbers a and b, where ‘b’ is incremented or decremented by some percentage of ‘a’.\nThe program will find out that percentage and return it.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        System.out.println("Output " + FunPercent(a, b) + "%");
    }
}
