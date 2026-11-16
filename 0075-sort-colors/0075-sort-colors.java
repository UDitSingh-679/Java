
class Solution {
    public void sortColors(int[] nums) {

        for(int i=1;i<nums.length;i++){
            int cur=i;
            int prev=i-1;
            int curValue=nums[cur];

            while(prev>=0 && curValue<nums[prev]){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=curValue;
        }
    }
}
