package VahanTorosyan_ACAHomeworks.Homework6;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        System.out.println("Please enter '(' and ')' ) parenthesis only and program will Print \"valid\" if the parenthesis are balanced, and print \"invalid\" otherwise");
        System.out.print("Input parenthesis sequence : ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                balance++;
            }else {
                balance--;
            }

            if(balance < 0){
                System.out.println("Invalid");
                break;
            }

        }
        if (balance == 0) {
            System.out.println("Valid");
        }
    }
}
