class Solution {
    int totalCount(int k, int[] arr) {
        int totalCount = 0;
        
        // Iterate over each element in the array
        for (int num : arr) {
            // Calculate how many parts are needed for each element
            totalCount += (num + k - 1) / k;
        }
        
        return totalCount;
    }
}
