import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sample array
        System.out.println("Enter number of elements in the array:");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        System.out.println("Enter the elements:");
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input range
        System.out.println("Enter number of ranges:");
        int row = sc.nextInt();
        int[][] range = new int[row][2];

        System.out.println("Enter the ranges (start and end):");
        for (int i = 0; i < row; i++) {
            range[i][0] = sc.nextInt();
            range[i][1] = sc.nextInt();
        }

        // Print all ranges
        System.out.println("Ranges entered:");
        for (int i = 0; i < row; i++) {
            System.out.println(range[i][0] + " " + range[i][1]);
        }

        // Count how many samples fall in each range
        System.out.println("\nOutput:");
        for (int i = 0; i < row; i++) {
            int d1 = range[i][0];
            int d2 = range[i][1];
            int count = 0; // ✅ Reset count for each range

            for (int x : arr1) {
                if (x >= d1 && x <= d2) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }

        sc.close();
    }
}
