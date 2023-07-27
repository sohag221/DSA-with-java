import java.util.Scanner;

public class Bubble_Sort {
  static   void bubbleSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j = 0; j < arr.length - 1 - i; j++) {  // if 1 time outer loop work then 1 number is sorted
                if (arr[j] > arr[j + 1]) {            // if 2 time outer loop work then 2 number is sorted
                    int temp = arr[j];             // ------- ----- ---- ---  so (arr.length-1-i)
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter Array size: ");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        int []ar=new int[n];
        for (int i =0;i<ar.length;i++){
           ar[i]=input.nextInt();
        }
        bubbleSort(ar);


        for (int i =0;i<ar.length;i++){
            System.out.print(" "+ar[i]);
        }

    }
}
