public class PrefixSum {
    
    // Method to create prefix sum array
    public static int[] createPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }
    
    // Method to get sum of elements between index l and r using prefix sum
    public static int getRangeSum(int[] prefix, int l, int r) {
        if (l == 0) {
            return prefix[r];
        }
        return prefix[r] - prefix[l - 1];
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefix = createPrefixSum(arr);
        
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        System.out.println("Prefix sum array: " + java.util.Arrays.toString(prefix));
        
        // Get sum from index 1 to 3
        System.out.println("Sum from index 1 to 3: " + getRangeSum(prefix, 1, 3)); // Output: 9 (2+3+4)
        
        // Get sum from index 0 to 2
        System.out.println("Sum from index 0 to 2: " + getRangeSum(prefix, 0, 2)); // Output: 6 (1+2+3)
    }
}