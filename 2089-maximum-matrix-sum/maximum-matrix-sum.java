class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum =0;
        int count = 0;
        int min =1000000;
        for(int i= 0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int m = matrix[i][j];
                 if (m < 0) {
                    count++;
                    m = m * (-1);
                 }
                 if(m<min){
                    min = m;
                 }
         sum = sum + m;;
            }
        }

        
        if(count%2==0)
        {
        return sum;
        }
        else {
        sum = sum -(min+min);
        return sum;
}
}
}