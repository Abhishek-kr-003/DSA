class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i++){
            int ans1 = 1;
            List<Integer> res = new ArrayList<>();
            for(int j = 0 ; j <=i; j++){
                
                 res.add(ans1);
                ans1 = ans1*(i-j);
                ans1 = ans1/(j+1);
               
            }
            ans.add(res);
        }
        return ans;
    }
}