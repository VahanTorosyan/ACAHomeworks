package VahanTorosyan_ACAHomeworks.Homework7;

import java.util.Scanner;

public class Problem5 {
    static int Checker (int cheker){
        int counter = 0;
        while (cheker != 0){
            int c = cheker%10;
            if (c == 0){
                counter = counter + 1;
            }
            cheker /=10;
        }
        return counter;


    }

    public static void main(String[] args) {
        System.out.print("Please input nonnegative number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean condition = false;
        if(Checker(num)%2==0){
            condition = true;
        }
        System.out.println(condition);

    }
}
