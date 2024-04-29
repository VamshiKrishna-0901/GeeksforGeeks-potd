class Solution {
    int findMaxSum(int n, int m, int mat[][]) {
        
        if ( n < 3 || m < 3 ) { return -1; }
        
        int sum = 0, current_sum = 0;
    
        for ( int row = 0; row < n; row++ ) {
            for ( int col = 0; col < m; col++ ) {
                if ( row + 2 < n && col + 2 < m ) { current_sum = getHourglassSum(row, col, mat); }
                sum = Math.max(current_sum, sum);
            }
        }
        
        return sum;
    }
    
    static int getHourglassSum( int i, int j, int[][] a ) {
        return a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
    }
};