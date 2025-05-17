import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        // Input number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Push elements into stack
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            stack.push(m);
        }

        // Pop elements and store in array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = stack.pop();  // pop top -> insert in array
        }

        // Print the array (top of stack is first)
        System.out.println("Stack popped into array (Top to Bottom):");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
