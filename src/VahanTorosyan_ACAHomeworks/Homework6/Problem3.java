package VahanTorosyan_ACAHomeworks.Homework6;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        System.out.print("Input string : ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = "";
        for(int i = a.length() - 1; i >= 0; i--){
            b = b + a.charAt(i);
        }
        if(a.equals(b)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
