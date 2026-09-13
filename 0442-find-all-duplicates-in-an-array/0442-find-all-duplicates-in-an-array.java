class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result=new ArrayList<>();

        int n=nums.length;

        for(int i=0;i<n;i++){
            int Value=Math.abs(nums[i]);
            int position=Value-1;

            if(nums[position]>0){
                nums[position]=-nums[position];
            }
            else{
                result.add(Value);
            }
        }
        return result;
    }
}