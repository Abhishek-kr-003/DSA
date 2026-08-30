class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int idxMax = 0;
        int idxMin = 0;
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        if(nums.length == 2) return 2;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i]< min){
                min = nums[i];
                idxMin = i;
                } 
            if(nums[i]> max){
                max = nums[i];
                idxMax = i;
            } 
        }
        int res = 0;
        if (idxMin > idxMax) {
            int temp = idxMin;
            idxMin = idxMax;
            idxMax = temp;
        }

        int removeBothFromFront = idxMax + 1;
        int removeBothFromBack = n - idxMin;
        int removeOneFromEach = idxMin + 1 + n - idxMax;

        return Math.min(
            removeBothFromFront,
            Math.min(removeBothFromBack, removeOneFromEach)
        );
    }
}