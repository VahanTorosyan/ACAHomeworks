package VahanTorosyan_ACAHomeworks.Homework6;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String word = scanner.next();
        System.out.print("Input an index: ");
        int k = scanner.nextInt();
        if (k <= word.length()){
            char symbol = word.charAt(k);
            System.out.println("Character at index " + k + " is " + symbol);
        } else {
            System.out.println("out of bounds");
        }

    }
}
