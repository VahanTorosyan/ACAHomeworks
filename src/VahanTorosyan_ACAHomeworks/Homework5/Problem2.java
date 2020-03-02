package VahanTorosyan_ACAHomeworks.Homework5;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        System.out.print("Input size of array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input element " + i + " : ");
            array[i] = scanner.nextInt();
        }

    }
}
