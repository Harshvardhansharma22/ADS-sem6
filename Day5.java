//1) Valid Palindrome


// class Day5{

//     public boolean isPalindrome(String s){
//         //left=0,right=n-1;
//         //ignore invalid characters
//         //compare with lowercase characters
//         int l=0,r=s.length()-1;
//         while(l<r){
//             while(l<s.length() && !Character.isLetterOrDigit(s.charAt(l)))l++;
//             while(r>=0 && !Character.isLetterOrDigit(s.charAt(r)))r--;
//             if(l<r && Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
//                 return false;
//             }
//             l++;
//             r--;
//         }
//         return true;
//     }
// }

//2) Reverse String


// class Solution {
//     public void reverseString(char[] s) {
//         int l=0 ,r=s.length-1;
//         while (l<r){
//             char temp=s[l];
//             s[l]=s[r];
//             s[r]=temp;
//             l++;
//             r--;
//         }

//     }
// }


// 3)Valid Anagram


// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()) return false;
//         int []freq=new int [26];
//         for(char c:s.toCharArray())
//         freq[c-'a']++;
//         for(char c:t.toCharArray())
//         freq[c-'a']--;
//         for(int x:freq)
//         if(x!=0)return false;
//         return true;
//     }
// }


// 4)Ransom Note

// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         int []freq=new int [26];
//         for(char c:magazine.toCharArray())
//             freq[c-'a']++;
//            for(char c:ransomNote.toCharArray()){
//                 if(freq[c-'a']==0)return false;
//                 freq[c-'a']--;
//             }
//             return true;
//         }
//     }
