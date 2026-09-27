class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        if(k == 0){
            return -0;
        }
        if(k < 0 || k > n){
            return -1;
        }
        int currSum = 0;
        for(int i = 0 ; i < k ; i++){
            currSum+=cardPoints[i];
        }
        int maxSum = currSum;
        for(int i = 1 ; i <= k ; i++){
            currSum-=cardPoints[k-i];
            currSum+=cardPoints[n-i];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}