class Solution {
    public int pivotIndex(int[] nums) {
         
        //  for(int i=0;i<nums.length;i++){
        //     int leftsum=0;
        //     int rightsum=0;

        //     for(int j=0;j<i;j++){
        //         leftsum+=nums[j];
        //     }

        //     for(int j=i+1;j<nums.length;j++){
        //         rightsum+=nums[j];
        //     }
        //     if(leftsum==rightsum){
        //         return i;
        //     }


        //  }
        //  return -1;

        int totalsum=0;

        for(int elements:nums){
            totalsum+=elements;
        }
        int leftsum=0;

        for(int i=0;i<nums.length;i++){
            int rightsum=totalsum-(leftsum+nums[i]);

            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}