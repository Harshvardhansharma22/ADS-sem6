//-----------DAY1

// public class java{
//     public static void main(String[] args){
//         int [] arr ={2,1,5,1,3,2};
//         int k=3;
//         int windowSum=0;
//         for(int i=0;i<k;i++){
//             windowSum+=arr[i];
//         }
//         int maxSum=windowSum;
//         for(int right = k;right<arr.length;right++){
//             windowSum+=arr[right];
//             windowSum-=arr[right-k];
//             maxSum=Math.max(maxSum,windowSum);
//         }
//         System.out.println("maximum Sum = "+maxSum);
//     }
// }

// public class java{
//     public static void main(String[] args) {

        //array=[2,1,5,1,3]
        //k=7


        //left=0
        //sum=0
        //maxLen=0


        //array=[2,1,5,1,3]
        //right=0
        //add arr[0]=24
        //sum=2
        //window=[2]
        //length=1
        
        //right=1
        //add arr[1]=1
        //sum=3
        //window=[2,1]
        //length=2

        //right=2
        //add arr[2]=5
        //sum=8

        //remove arr[0]=2
        //sum=6 ,condition is true
        //left=1

        //window=[1,5]
        //length=2

        //right =3
        //add arr[3]=1
        //sum=7
        //window=[1,5,1]
        //length=3

        //rigth=4
        //add arr[4]=3
        //sum=10

        //remove arr[1] sum=9
        //remove arr[2] sum=4


//         int[] arr={2,1,5,1,3};
//         int k=7;
//         int left=0;
//         int sum=0;
//         int maxLen=0;
//         for(int right=0;right<arr.length;right++){
//             sum+=arr[right];
//             while(sum>k){
//                 sum-=arr[left];
//                 left++;
//             }
//             maxLen=Math.max(maxLen,right-left+1);
//         }
//         System.out.println(maxLen);
//     }
// }


// public class Day1{
// public static void main(String[] args) {
//         //left
//         //right
//         //array ={1,2,3,4,6};
//         //target=6

//         int[]arr={1,2,3,4,6};
//         int target=6;
//         int left=0;
//         int rigth= arr.length-1;
//         boolean found=false;
//         while(left<rigth){
//         int sum=arr[left]+arr[rigth];
//         if(sum==target){
//                 found=true;
//                 break;
// }else if(sum<target){
//                 left++;
//         }else{
//                 rigth--;
//         }
//         }
//         System.out.println(found);
// }
// }


//-----------WORKING CODE DAY1.java-----------

// 1)Question 1 (Easy): Fixed Size Sliding Window
// Given an integer array and an integer K, find the maximum average of any subarray of size K.
// Input:
// arr = [1, 12, -5, -6, 50, 3]
// K = 4
// Output:
// Maximum average subarray value
// Hint: Use fixed size sliding window.


// public class Day1 {
//     public static void main(String[] args) {
//         int[] arr = {1, 12, -5, -6, 50, 3};
//         int k = 4;

//         int sum = 0, max;
//         for (int i = 0; i < k; i++) sum += arr[i];
//         max = sum;

//         for (int i = k; i < arr.length; i++) {
//             sum += arr[i] - arr[i - k];
//             max = Math.max(max, sum);
//         }

//         System.out.println((double) max / k);
//     }
// }



// 2)Question 2 (Medium): Variable Size Sliding Window
// Given an array of positive integers and an integer K, find the length of the smallest subarray whose
// sum is greater than or equal to K.
// Input:
// arr = [2, 3, 1, 2, 4, 3]
// K = 7
// Output:
// Smallest subarray length
// Hint: Expand window using right pointer and shrink using left pointer.


// public class Day1 {
//     public static void main(String[] args) {
//         int[] arr = {2, 3, 1, 2, 4, 3};
//         int k = 7;

//         int sum = 0, left = 0, min = Integer.MAX_VALUE;

//         for (int right = 0; right < arr.length; right++) {
//             sum += arr[right];

//             while (sum >= k) {
//                 min = Math.min(min, right - left + 1);
//                 sum -= arr[left++];
//             }
//         }

//         System.out.println(min == Integer.MAX_VALUE ? 0 : min);
//     }
// }



// 3)Question 3 (Hard): Sliding Window + Two Pointers
// Given a string, find the length of the longest substring that contains at most K distinct characters.
// Input:
// String = "eceba"
// K = 2
// Output:
// Length of the longest valid substring
// Hint: Use sliding window with a frequency map



// import java.util.*;

// public class Day1 {
//     public static void main(String[] args) {
//         String s = "eceba";
//         int k = 2;

//         Map<Character, Integer> map = new HashMap<>();
//         int left = 0, max = 0;

//         for (int right = 0; right < s.length(); right++) {
//             map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

//             while (map.size() > k) {
//                 char c = s.charAt(left++);
//                 map.put(c, map.get(c) - 1);
//                 if (map.get(c) == 0) map.remove(c);
//             }

//             max = Math.max(max, right - left + 1);
//         }

//         System.out.println(max);
//     }
// }



