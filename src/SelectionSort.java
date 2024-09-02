import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        sort(n, arr);
        for (int i : arr) {
            System.out.print(i+ " ");
        }

    }
    public static void sort(int n, int[] arr) {
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i; j < n ; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
