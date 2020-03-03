package VahanTorosyan_ACAHomeworks.Homework5;

public class Problem9 {
    public static void main(String[] args) {
        System.out.println("Have a two arrays\n{1, 5, 32, 454, 56, 8, 3}\n{6, 5, 99, 454, 65, 8, 3}\nLet's find which numbers from first one not available in second");
        int[] arr1 = new int[]{1, 5, 32, 454, 56, 8, 3};
        int[] arr2 = new int[]{6, 5, 99, 454, 65, 8, 3};


        for (int i = 0; i < arr1.length; ++i) {
            boolean found = false;
            for (int j = 0; j < arr2.length; ++j) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(arr1[i] + " is not available in second");
            }
        }

    }
}
