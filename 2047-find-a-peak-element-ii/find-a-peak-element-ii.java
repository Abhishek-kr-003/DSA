class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int left = 0;
        int right = cols - 1;
        
        while(left < right){
            int mid = left + (right - left)/2;
            int peak = 0;
            for(int i = 0 ; i < rows ; i++){
                if(mat[i][mid] >mat[peak][mid]){
                    peak = i;
                }
            }
            if(mat[peak][mid] < mat[peak][mid+1]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        int peak = 0 ;
        for(int i = 0 ; i < rows ; i++){
            if(mat[i][left] > mat[peak][left]){
                peak = i;
            }
        }
            return new int[]{peak,left}   ;              
    }
}