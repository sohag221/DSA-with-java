import java.util.Scanner;

public class Quick_Sort {
    public static void quickSort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex > highIndex) {
            return;
        }
        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        while (leftPointer < rightPointer) {

            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, lowIndex + 1, highIndex);
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int ar[] = {1, 7, 2, 5, 6};
        quickSort(ar, 0, ar.length - 1);

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
