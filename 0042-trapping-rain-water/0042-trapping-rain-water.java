class Solution {
    public int trap(int[] height) {

        int n=height.length;
        int maxindex=0;
        int max=0;
        int sum=0;

        for(int i=0;i<n;i++){

            if(height[i]>=max){
                max=height[i];
                maxindex=i;
            }
            sum+=max-height[i];
        }
        for(int i=maxindex;i<n;i++){
            sum-=max-height[i];
        }
        max=0;
        for(int i=n-1;i>maxindex;i--){
            if(height[i]>=max){
                max=height[i];
            }
            sum+=max-height[i];
        }
        return sum;

        
    }
}