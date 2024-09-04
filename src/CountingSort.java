import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==0) {
            sc.close();
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // countingSort(arr, n);
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }

        int[] result = countingSort(arr, n);
        // System.out.print("Ouput arr : ");
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
 
    public static int[] countingSort(int[] arr, int n) {
        // int max = arr[0];
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        // }
        int max = Arrays.stream(arr).max().getAsInt();

        int[] countArray = new int[max + 1];
        int[] outputArray = new int[n];

        for (int i = 0; i < n; i++) {
            countArray[arr[i]]++;
        }
        // System.out.print("CountArray init : ");
        // for (int i : countArray) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        for (int i = 1; i < max + 1; i++) {
            countArray[i] += countArray[i - 1];
        }
        // System.out.print("CountArray after : ");
        // for (int i : countArray) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();

        for (int i = 0; i < n; i++) {
            outputArray[countArray[arr[i]]-1] = arr[i];
            countArray[arr[i]]--;
        }

        return outputArray;
    }
}
