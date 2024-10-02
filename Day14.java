class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        int n = arr.size();  // Initial size of the array
        int operations = n / 2;  // We need to perform n/2 operations

        // Perform the operations
        for (int k = 1; k <= operations; k++) {
            // Step 1: Rotate the array clockwise by 1 (right rotate)
            Collections.rotate(arr, 1);
            
            // Step 2: Delete the (n - k + 1)-th element from the start
            // After each deletion, the size of the array decreases
            int deleteIndex = arr.size() - k; // n - k, adjusting for current size
            arr.remove(deleteIndex);  // Delete the element
        }
        
        // After all operations, return the first element of the remaining array
        return arr.get(0);
    }
    
    
}
