package VahanTorosyan_ACAHomeworks.Homework5;

public class Problem4 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 44, -65, 4};
        int[] clone = new int[array.length];
        for(int i = 0; i < array.length; i++){
            clone[i] = array[i];
        }
        System.out.print("Original Array :");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Clone Array :");
        for(int i = 0; i < clone.length; i++){
            System.out.print(clone[i] + " ");
        }
    }
}
