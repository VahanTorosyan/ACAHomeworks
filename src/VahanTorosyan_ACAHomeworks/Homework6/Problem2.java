package VahanTorosyan_ACAHomeworks.Homework6;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Please enter the any sentence and program will calculate number of words");
        Scanner scanner = new Scanner(System.in);
        String sr = scanner.nextLine();
        char[] letter = new char[sr.length()];
        int result = 0;
        for (int i = 0; i < sr.length(); i++) {
            letter[i] = sr.charAt(i);
            if (((i > 0) && (letter[i] != ' ' && letter[i] != '\t') && (letter[i - 1] == ' ' || letter[i - 1] == '\t')) || ((letter[0] != ' ' && letter[0] != '\t') && (i == 0))) {
                result++;
            }

        }
        System.out.println("The number of word : " + result);
    }
}
