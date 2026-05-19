class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        if(nums.length==0){
            return 0;
        }
        for(int i =0;i<nums.length;i++){
                set.add(nums[i]);
        }
        int f=0;
        for(int i : set){
            if(!set.contains(i-1)){
                int n=i;
                int c=1;
                while(set.contains(n+1)){
                    n++;
                    c++;
                }
                f=Math.max(f,c);
            }
        }
        return f;
    }
}