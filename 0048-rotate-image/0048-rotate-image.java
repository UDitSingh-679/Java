class Solution {
    public void rotate(int[][] matrix) {
        
        // Transpose of amtrix

        for(int i=0;i<matrix.length;i++){
            for(int j=i+1; j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // reverse row
        for(int row=0;row<matrix.length;row++){
            int startcol=0;
            int endcol=matrix[0].length-1;

            while(startcol<endcol){
                int temp=matrix[row][startcol];
                matrix[row][startcol]=matrix[row][endcol];
                matrix[row][endcol]=temp;

                startcol++;
                endcol--;
            }
        }
    }
}