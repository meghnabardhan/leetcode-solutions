class Solution {
    public int[] twoSum(int[] numbers, int target) {
    //Optimized version - two pointer approach as array is already sorted
    /* So here basically what we do is since the array is already sorted it gets easier, we only take two variables left as 0 and right as array length-1 and then check if left+right indexed numbers sum equals the target then return, if less than target then left --, if more than target then target  */
    int left =0;
    int right= numbers.length -1;
    while(left<right){
        if((numbers[left]+numbers[right])==target){
            return new int[]{left+1, right+1};
        }
        else if((numbers[left]+numbers[right])>target){
            right--;
        }
        else{
            left++;
        }
    }
    return new int[]{};
    }
}