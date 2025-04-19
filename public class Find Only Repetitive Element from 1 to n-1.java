class Solution {
    public int findDuplicate(int[] arr) {
        int rem = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != rem) {
                    rem = rem + arr[i];
                }
            }
        }
        return rem;
    }
}

public class FindDuplicateElement {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {1, 3, 4, 2, 2};
        int result = solution.findDuplicate(arr);

        System.out.println("Duplicate: " + result);
    }
}
