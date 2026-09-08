class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int Maxsum=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
            Maxsum=Math.max(Maxsum,sum);

            if(sum<0){
                sum=0;
            }
        }
        return Maxsum;
    }
}