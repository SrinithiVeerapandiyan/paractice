class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        //int mat[][]=new mat[r][c];
        for(int i=0;i<r-1;i++){
            for(int j=i+1;j<r;j++){
             int temp=matrix[i][j];
             matrix[i][j]=matrix[j][i];
             matrix[j][i]=temp;
            }
        }
        for(int []arr:matrix){
            for(int k=0;k<r/2;k++){
                int temp1=arr[k];
                arr[k]=arr[r-k-1];
                arr[r-k-1]=temp1;
            }
        }
    }
}