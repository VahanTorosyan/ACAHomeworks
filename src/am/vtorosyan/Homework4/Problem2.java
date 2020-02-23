package am.vtorosyan.Homework4;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Please find the sum of first 20 natural numbers");
        int i = 1;
        int sum = 0;
        while (i <= 20) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
