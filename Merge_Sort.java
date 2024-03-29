import java.util.Scanner;

public class Merge_Sort {

    public static void merge(int[] inputArray, int[] leftHalfArray, int[] rightHalfArray) {
        int leftSize = leftHalfArray.length;
        int rightSize = rightHalfArray.length;

        int i = 0; // traverse for leftHalfArray
        int j = 0; //traverse for rightHalfArray
        int k = 0; // traverse for inputArray

        while (i < leftSize && j < rightSize) {
            if (leftHalfArray[i] <= rightHalfArray[j]) {
                inputArray[k] = leftHalfArray[i];
                i++;
            } else {
                inputArray[k] = rightHalfArray[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            inputArray[k] = leftHalfArray[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightHalfArray[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int[] inputArray) {
        int arrayLength = inputArray.length;
        if (arrayLength < 2) {
            return;
        }
        int midIndex = arrayLength / 2;
        int[] leftHalfArray = new int[midIndex];
        int[] rightHalfArray = new int[arrayLength - midIndex];
        for (int i = 0; i < midIndex; i++) {
            leftHalfArray[i] = inputArray[i];
        }
        for (int i = midIndex; i < arrayLength; i++) {
            rightHalfArray[i - midIndex] = inputArray[i];
        }
        mergeSort(leftHalfArray);
        mergeSort(rightHalfArray);

        merge(inputArray, leftHalfArray, rightHalfArray);
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
        mergeSort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(" " + ar[i]);
        }

    }
}
