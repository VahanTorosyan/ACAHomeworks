package VahanTorosyan_ACAHomeworks.Homework5;

public class Problem7 {
    public static void main(String[] args) {
        System.out.println("Given an array of integers [8, 9, 5, 100, 78]\nThe program will create new array and copy the data from first one in reversed order.");
        int[] array = new int[]{8, 9, 5, 100, 78};
        int[] clone = new int[5];
        int k = 5;
        for (int i = 0; i < array.length; i++) {
            k -= 1;
            clone[k] = array[i];
        }

        System.out.print("In: ");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            } else if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println();

        System.out.print("Out: ");
        for (int i = 0; i < clone.length; i++) {
            if (i == 0) {
                System.out.print("[" + clone[i] + ", ");
            } else if (i == clone.length - 1) {
                System.out.print(clone[i] + "]");
            } else {
                System.out.print(clone[i] + ", ");
            }

        }
    }
}
