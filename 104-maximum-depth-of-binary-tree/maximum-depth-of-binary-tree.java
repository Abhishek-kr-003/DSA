/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
       Queue<TreeNode> que = new ArrayDeque<>();
       if(root == null){
        return 0;
       }  
       int res = 0;
       que.add(root);

       while(!que.isEmpty()){
        int levelorder = que.size();
        for(int i = 0 ; i < levelorder; i++){
            TreeNode node = que.poll();
            
            if(node.left != null){
                que.add(node.left);
            } 
            if(node.right != null){
                que.add(node.right);
            }
        }
        res = res+1;
       }
       return res;
    }
}