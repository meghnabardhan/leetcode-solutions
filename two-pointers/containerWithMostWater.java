class Solution {
    public int maxArea(int[] height) {
        /*We take two pointers left and right and we run a loop till left< right,  then we update max as the maximum of (lenght * breadth),and previous maximum. Now length is right -left and breadth will be the minimum number stored in the left and right. */
        int right=height.length-1;
        int left=0;
        int max=0;
        while(left<right){
            max=Math.max(((right-left)* Math.min(height[left],height[right])),max);
            if(height[left]<=height[right])
            left++;
            else right --;
        }
        return max;
    }
}