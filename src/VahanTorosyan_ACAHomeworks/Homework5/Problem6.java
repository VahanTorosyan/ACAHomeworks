package VahanTorosyan_ACAHomeworks.Homework5;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        System.out.print("Input size of array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input element " + i + " : ");
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum element in array : " + max);
        System.out.println("Minimum element in array : " + min);
    }
}
