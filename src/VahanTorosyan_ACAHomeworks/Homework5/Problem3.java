package VahanTorosyan_ACAHomeworks.Homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        System.out.print("Input size of String type array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] array = new String[n];
        String single = "Apple";
        for (int i = 0; i < n; i++) {
            System.out.print("Input Word in array element " + i + " : ");
            array[i] = scanner.next();
        }
        if (Arrays.asList(array).contains(single)) {
            System.out.println("You input secret word in " + Arrays.asList(array).indexOf(single) + " array element");
        } else {
            System.out.printf("Not Found");
        }

    }

}

