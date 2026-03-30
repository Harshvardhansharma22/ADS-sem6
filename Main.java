// public class Main {
//     public static void main(String[]args){
//         int [] arr={-2,1,-3,4,-1,2,1,-5,4};
//         int maxSum=arr[0];
//         int currentSum = arr[0];

//         for(int i=1;i<arr.length;i++){
//             currentSum=Math.max(arr[i],currentSum + arr[i]);
//             maxSum=Math.max(maxSum,currentSum);
//         }
//         System.out.println(maxSum);
//     }
// }


// public class Main{
//     public static void main(String[] args) {
//         int[] a= {1,2,2,2,3};
//         int t = 2, l=0,r=a.length -1,ans=-1;
//         while(l<=r){
//             int m=(l+r)/2;

//             if(a[m]>=t){
//                 if(a[m]==t)ans=m;
//                 r=m-1;
//             }else{
//                 l=m+1;
//             }
//         }
//         System.out.println(ans);
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         String s = "abcabcbb";
//         int l=0,max=0;
//         int []seen = new int [256];
//         for(int r=0;r<s.length();r++){
//             while (seen[s.charAt(r)]==1){
//                 seen[s.charAt(l)]=0;
//                 l++;
//             }
//             seen[s.charAt(r)]=1;
//             max=Math.max(max,r-l+1);
//         }
//         System.out.println(max);
//     }
// }

