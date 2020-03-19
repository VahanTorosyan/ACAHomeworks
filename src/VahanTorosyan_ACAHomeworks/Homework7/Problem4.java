package VahanTorosyan_ACAHomeworks.Homework7;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    static String[] revSTR(String arfn[]){
        String[] tmpArrStr = new String[arfn.length];
        for(int i = 0; i < arfn.length; i++){
            String tmpOrSTR = arfn[i];
            String tmpRevSTR = "";
            for(int j = tmpOrSTR.length()-1 ; j >= 0; j--){
                tmpRevSTR = tmpRevSTR + tmpOrSTR.charAt(j);
            }
            tmpArrStr[i] = tmpRevSTR;

            //System.out.println(arfn[i]);
        }
return tmpArrStr;
    }


    public static void main(String[] args) {
        System.out.println("Please enter Sting array length and fill each array element");
        System.out.print("Enter Array length: ");
        Scanner scanner = new Scanner(System.in);
        int arLn = scanner.nextInt();
        String[] array = new String[arLn];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Please enter " + i + " element: ");
            array[i] = scanner.next();
        }
        System.out.println("Inputted Array : " + Arrays.toString(array));
        System.out.println("Modified : " + Arrays.toString(revSTR(array)));
        //System.out.println(revSTR(array));
    }
}
