package am.vtorosyan.Homework4;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows and columns: ");
        int n = scanner.nextInt();
        int rA = 1;
        int rB = 1;
        int c = 1;
        String w = "white";
        String b = "black";
        String r1 = "";
        String r2 = "";

        while (c <= n) {
            if (c % 2 != 0) {
                while (rA <= n) {
                    if (rA % 2 == 0 && rA != n) {
                        r1 += w + "-";
                    } else if (rA == n && rA % 2 == 0) {
                        r1 += w;
                    } else if (rA % 2 != 0 && rA != n) {
                        r1 += b + "-";
                    } else if (rA == n && rA % 2 != 0) {
                        r1 += b;
                    }
                    rA++;
                }
                System.out.println(r1);

            } else {
                while (rB <= n) {
                    if (rB % 2 == 0 && rB != n) {
                        r2 += b + "-";
                    } else if (rB == n && rB % 2 == 0) {
                        r2 += b;
                    } else if (rB % 2 != 0 && rB != n) {
                        r2 += w + "-";
                    } else if (rB == n && rB % 2 != 0) {
                        r2 += w;
                    }
                    rB++;
                }
                System.out.println(r2);
            }
            c++;
        }
    }
}