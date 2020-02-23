package am.vtorosyan.Homework4;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println("Input 2 integers and program will calculate the number and sum of all integer between 1st and 2dn numbers which are divisible by 9");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1st number : ");
        int x = scanner.nextInt();
        System.out.print("Input 2nd number : ");
        int y = scanner.nextInt();
        int sum = 0;
        System.out.println("Numbers between" + x + " and " + y + ", divisible by 9:");
        while (x <= y) {
            if (x % 9 == 0) {
                System.out.print(x + " ");
                sum += x;
            }
            x++;
        }
        System.out.println();
        System.out.println("Sum of these numbers is : " + sum);
    }
}
