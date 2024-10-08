
class Solution {
    public static int pairsum(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
       
        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax; 
                firstMax = num;      
            } else if (num > secondMax) {
                secondMax = num;      
            }
        }
        

        return firstMax + secondMax;
    }
}