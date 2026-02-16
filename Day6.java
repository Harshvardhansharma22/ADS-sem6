// public class Day6 {
//     public static int []llps(String pattern){
//         int n =pattern.length();
//         int []lps = new int[n];
//         int len=0;
//         int i=1;
//         while(i<n){
//             if(pattern.charAt(i)==pattern.charAt(len)){
//                 len++;
//                 lps[i]=len;
//                 i++;
//             }
//             else{
//                 if(len!=0){
//                     len=lps[len-1];
//                 }
//                 else{
//                     lps[i]=0;
//                     i++;
//                 }
//             }
//         }
//         return lps;
//     }
//     public static void main(String[] args) {
//         System.out.println("Try programiz.pro");
//         String pattern="ababaca";
//         int []lps=llps(pattern);
//         for(int x:lps){
//             System.out.print(x+" ");
//         }
//     }
// }

