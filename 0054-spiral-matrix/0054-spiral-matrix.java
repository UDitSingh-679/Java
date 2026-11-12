class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result=new ArrayList<>();

        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;

        while(top<=bottom && left<=right){
            // left to right
            for(int j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            // top to bottom
            for(int j=top;j<=bottom;j++){
                result.add(matrix[j][right]);
            }
            right--;

            // right to left

            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // bottom to top
            if(left<=right){
                for(int j=bottom;j>=top;j--){
                    result.add(matrix[j][left]);
                }
                left++;
            }
        }
        return result;
        
    }
}