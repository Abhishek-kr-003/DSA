class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0 ;
        int prefixSum = 0;
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        prefixSumCount.put(0,1);
        for(int i = 0 ; i < nums.length ; i++){
            prefixSum+=nums[i];     //to add the numbers and get the prefix sum
            int remove = prefixSum -k;  //so here we check wether prefix sum - k is present , if does then increase count by the number of times they are present
            if(prefixSumCount.containsKey(remove)){
                count+= prefixSumCount.get(remove);
            }
            prefixSumCount.put(prefixSum , prefixSumCount.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
}