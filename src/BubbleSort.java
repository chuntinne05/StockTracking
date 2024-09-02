import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int swapped = 0;
            for (int j = 0; j <  array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if (swapped == 0 ) {
                break;
            }
        }
    }
}