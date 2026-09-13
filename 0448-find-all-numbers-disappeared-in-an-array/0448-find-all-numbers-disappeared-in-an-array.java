class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result=new ArrayList<>();
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            int Value=Math.abs(nums[i]);
            int position=Value-1;

            if(nums[position]>0){
                nums[position]=-nums[position];
            }
        }

        for(int i=0;i<n;i++){
           if(nums[i]>0){
             result.add(i+1);
           }
        }
        return result;

    }
}