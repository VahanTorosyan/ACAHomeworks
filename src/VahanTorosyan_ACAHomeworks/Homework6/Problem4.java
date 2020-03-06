package VahanTorosyan_ACAHomeworks.Homework6;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        System.out.print("Input a string: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.print("Input number of rotations: ");
        int n = scanner.nextInt();
        char[] ch = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            ch[i] = word.charAt(i);
        }
        char tmp;
        for (int i = 0; i < n; i++) {
            tmp = ch[0];
            for (int j = 0; j < ch.length - 1; j++) {
                ch[j] = ch[j + 1];
            }
            ch[ch.length - 1] = tmp;
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
