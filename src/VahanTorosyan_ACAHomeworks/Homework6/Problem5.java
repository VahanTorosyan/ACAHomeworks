package VahanTorosyan_ACAHomeworks.Homework6;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        System.out.print("Input first string : ");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.print("Input second string: ");
        String str2 = scanner.nextLine();
        if (str1.length() != str2.length()){
            System.out.println("Is not rotation");
        } else {
            String str3 = str1 + str1;
            if(str3.contains(str2)){
                System.out.println("Is a rotation");
            } else {
                System.out.println("Is not rotation");
            }
        }

    }
}
