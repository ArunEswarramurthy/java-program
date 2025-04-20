import java.util.*;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int result = search(arr, target, 0, arr.length - 1);
        System.out.println(result);
        sc.close();
    }
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        } else if (arr[m] < target) {
            return search(arr, target, m + 1, e);
        } else {
            return search(arr, target, s, m - 1);
        }
    }
}