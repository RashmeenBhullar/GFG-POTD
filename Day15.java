class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        int n = nums.size();
        
        // Edge case
        if (n == 0) {
            return new ArrayList<>();
        }

        // First pass: Find potential candidates
        int candidate1 = -1, candidate2 = -1, count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Second pass: Verify the candidates
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) {
            result.add(candidate1);
        }
        if (count2 > n / 3) {
            result.add(candidate2);
        }

        // If no candidate qualifies, return -1
        if (result.isEmpty()) {
            result.add(-1);
        }

        // Sort the result in increasing order
        Collections.sort(result);
        return result;
    }
}

