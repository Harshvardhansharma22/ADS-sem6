//1) Two Sum


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer,Integer>map=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             int complement=target-nums[i];
//             if(map.containsKey(complement)){
//                 return new int[] {map.get(complement),i};
//             }
//             map.put(nums[i],i);
//         }
//         return new int[] {};
//     }
// }

// 2)Valid Anagram

// import java.util.HashMap;
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length())return false;
//     if(s.length()!=t.length()) return false;
// HashMap<Character, Integer>map=new HashMap<>();
// for(char c:s.toCharArray()) {
// map.put(c,map.getOrDefault(c,0)+1);
// }
// for(char c:t.toCharArray()) {
// if(!map.containsKey(c)) return false;
// map.put(c,map.get(c)-1);
// if(map.get(c)==0)
// map.remove(c);

// }
// return map.isEmpty();
// }
// }

// 3) First Unique Character in a String

// import java.util.HashMap;
// class Solution {
//     public int firstUniqChar(String s) {
//         HashMap<Character,Integer>map=new HashMap<>();
//         for(char c:s.toCharArray()){
//             map.put(c,map.getOrDefault(c,0)+1);
//         }
//         for(int i=0;i<s.length();i++){
//             if(map.get(s.charAt(i))==1)
//             return i;
//         }
//         return -1;
//     }
// }