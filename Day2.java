
class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        int maxheight=0;
        int count=0;
        for(int h:height){
            if(h>maxheight){
                maxheight=h;
                count++;
            }
        }
        return count;
    }
}