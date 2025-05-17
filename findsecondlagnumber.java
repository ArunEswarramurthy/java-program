import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int first = arr[0];
        int second = -1;  // Use -1 as a placeholder

        // Find first number greater than `first`
        for(int i = 1; i < n; i++) {
            if(arr[i] != first) {
                second = arr[i];
                break;
            }
        }

        if (second == -1) {
            System.out.println("No second smallest element found.");
        } else {
            System.out.println(first + " " + second);
        }
    }
}
