package VahanTorosyan_ACAHomeworks.Homework4;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        System.out.println("Input an integer n. The program will find the following sum: 1 + ½ + ⅓ +¼ + … 1/n ");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Input: ");
        int n = scanner.nextInt();
        double i = 1;
        double sum = 0;
        while (i <= n) {
            sum += 1/i;
            i++;
        }
        System.out.println("Output: " + sum);

    }
}
