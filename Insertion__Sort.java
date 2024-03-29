import java.util.Scanner;

public class Insertion__Sort {

    public static void insertion_Sort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int value = ar[i];
            int j = i - 1;
            while (j >= 0 && value < ar[j]) {
                ar[j + 1] = ar[j];
                --j;
            }
            ar[j + 1] = value;
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Enter Array size: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = input.nextInt();
        }
        insertion_Sort(ar);

        for (int i = 0; i < ar.length; i++) {
            System.out.print(" " + ar[i]);
        }

    }
}
