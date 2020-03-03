package VahanTorosyan_ACAHomeworks.Homework5;

public class Problem8 {
    public static void main(String[] args) {
        System.out.println("Given an array of integers [8, 9, 5, 100, 78]\nThe program will arrange the elements in array in reverse order.");
        int[] array = new int[]{8, 9, 5, 100, 78};
        int tmp;
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

        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }

        System.out.println();

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


    }
}
