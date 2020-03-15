package VahanTorosyan_ACAHomeworks.Homework7;

import java.util.Scanner;

public class Problem3 {
    static int Index(int arr[], int n){
        int arrLen = arr.length;
        for(int i = 0; i < arrLen; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Please enter the massive length: ");
        Scanner scanner = new Scanner(System.in);
        int arrlen = scanner.nextInt();
        int [] arrayIn = new int[arrlen];
        for (int i = 0; i < arrlen; i++){
            System.out.print("Please enter the " + i + " numbers of array: ");
            arrayIn[i] = scanner.nextInt();
        }
        System.out.print("Please enter the number from array and program will return the index of it in array: ");
        int num = scanner.nextInt();
        System.out.println("Output " + Index(arrayIn, num));

    }
}
