import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        insertionSort(n, arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (key < arr[j] && j >= 0) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
    }
}
