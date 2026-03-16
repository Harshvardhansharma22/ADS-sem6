// class Solution{
//     public TreeNode searchBST(TreeNode root,int val){
//         if(root==null||root.val==val)
//             return root;
//         if(val<root.val)
//             return searchBST(root.left,val);
//         else
//             return search(root.right,val);
//     }
// }


// 2)Insert into a Binary Search Tree
// class Solution{
//     public TreeNode insertIntoBST(TreeNode root,int val){
//         if(root==null)
//             return new TreeNode(val);
//         if(val<root.val)
//             root.left=insertIntoBST(root.left,val);
//         else
//             root.right=insertIntoBST(root.right,val);
//         return root;
//     }
// }


//3)Validate Binary Search Tree

// class Solution {
//     public boolean isValidate(TreeNode root){
//         return is validate(TreeNode node,long min,long max){
//             if(node==null)
//                 return true;
//             if(node.val<=min||node.val>=max)
//                 return false;
//             return isValidate(node.left,min,node.val)&&
//             isValidate(node.right,node.val,max);
//         }
//     }
// }
