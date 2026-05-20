class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int prev=1,aft=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=prev;
            prev*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=aft;
            aft*=nums[i];
        }
        return ans;
    }
}