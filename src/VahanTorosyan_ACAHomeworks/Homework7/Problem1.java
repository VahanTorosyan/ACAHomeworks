package VahanTorosyan_ACAHomeworks.Homework7;

import java.util.Scanner;

public class Problem1 {
    static int Sum(int num){
        int negotive = -1;
        int result = 0;
        if(num < 0){
            return negotive;
        }else {
            while (num > 0) {
                result = result + num % 10;
                num = num / 10;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("input nonnegative integer and program will return the sum of the digits");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int num = scanner.nextInt();
        if (Sum(num) < 0){
            System.out.println("Please enter nonnegative number");
        }else {
            System.out.println("The sum is " + Sum(num));
        }
    }
}
