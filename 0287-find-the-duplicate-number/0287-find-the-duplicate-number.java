class Solution {
    public int findDuplicate(int[] nums) {
        
        int n=nums.length;

        for(int i=0;i<n;i++){

            int Value=Math.abs(nums[i]);
            int position=Value-1;

            if(nums[position]>0){
                nums[position]=-nums[position];
            }
            else{
                return Value;
            }
        }
        return 0;
    }
}