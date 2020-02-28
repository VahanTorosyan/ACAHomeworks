package VahanTorosyan_ACAHomeworks.Homework4;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        System.out.println("Input an integer and program will calculate the result of the following formula:\n" + "1 - 2 + 3 - 4 + 5 - 6 + 7 .... (+or-) n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        System.out.print("Output: ");
        while (i <= n) {
            if (i % 2 == 0) {
                sum -= i;
                if (i < n) {
                    System.out.print(i + " + ");
                } else {
                    System.out.print(i + " = ");
                }
            } else {
                sum += i;
                if (i != n) {
                    System.out.print(i + " - ");
                } else {
                    System.out.print(i + " = ");
                }
            }
            i++;
        }
        System.out.print(sum);
    }
}

