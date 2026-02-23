// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List <List<Integer>>result=new ArrayList<>();

//         backtrack(nums,0,new ArrayList<>(),result);
//         return result;
//     }
//     private void backtrack(int[] nums,int index, 
//     List<Integer>current,List<List<Integer>>result){
//         result.add(new ArrayList<>(current));
//         for(int i=index;i<nums.length;i++){
//             current.add(nums[i]);
//             backtrack(nums,i+1,current,result);
//             current.remove(current.size()-1);
//         }
//     }
// }




// 2) Divide Two Integers


// class Solution {
//     public int divide(int dividend, int divisor) {


//         if (dividend == Integer.MIN_VALUE && divisor == -1) {
//             return Integer.MAX_VALUE;
//         }

//         long dvd = Math.abs((long) dividend);
//         long dvs = Math.abs((long) divisor);

//         int result = 0;

//         while (dvd >= dvs) {

//             long temp = dvs;
//             int multiple = 1;

//             while (dvd >= (temp << 1)) {
//                 temp <<= 1;
//                 multiple <<= 1;
//             }

//             dvd -= temp;
//             result += multiple;
//         }

//         if ((dividend < 0) ^ (divisor < 0)) {
//             return -result;
//         }

//         return result;
//     }
// }


// 3)Combination Sum


// import java.util.*;

// class Solution {

//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         List<List<Integer>> result = new ArrayList<>();
//         backtrack(0, candidates, target, new ArrayList<>(), result);
//         return result;
//     }

//     private void backtrack(int index, int[] candidates, int target,
//                            List<Integer> current, List<List<Integer>> result) {

//         if (target == 0) {
//             result.add(new ArrayList<>(current));
//             return;
//         }

//         if (index == candidates.length || target < 0) {
//             return;
//         }

//         current.add(candidates[index]);
//         backtrack(index, candidates, target - candidates[index], current, result);

//         current.remove(current.size() - 1);

//         backtrack(index + 1, candidates, target, current, result);
//     }
// }