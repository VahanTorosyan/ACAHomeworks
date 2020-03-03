package VahanTorosyan_ACAHomeworks.Homework5;

import java.util.HashMap;

public class Problem10 {
    static int firstElement(int arr[], int n, int k) {
        HashMap<Integer, Integer> count_map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = 0;
            if(count_map.get(arr[i])!=null){
                a = count_map.get(arr[i]);
            }

            count_map.put(arr[i], a+1);
        }

        for (int i = 0; i < n; i++)
        {
            if (count_map.get(arr[i]) == k) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 1, 32, 454, 3, 56, 8, 3};
        int n = arr.length;
        int k = 3;
        System.out.println(firstElement(arr, n, k));
    }
}


