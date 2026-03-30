//1)

// import java.util.Arrays;

// public class Day16 {
//     public int fibnocci(int n,int[]dp){
//         if(n<=1)return n;
//         if(dp[n]!= -1)return dp[n];
//         dp[n]=fibnocci(n-1,dp)+fibnocci(n-2,dp);
//         return dp[n];
//     }
//     public static void main(String[] args) {
//         int n=6;
//         int[]dp=new int [n+1];
//         Arrays.fill(dp,-1);
//         Day16 m =new Day16();
//         System.out.println(m.fibnocci(n,dp));
//     }
// }


//2)

// class Day16{
//     public int rob(int [] nums){
//         int n=nums.length;
//         if(n==1)return  nums[0];
//         int[]dp=new int[n];
//         dp[0]=nums [0];
//         dp[1]=Math.max(nums[0],nums[1]);
//         for(int i=2;i<n;i++){
//             dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
//     }
//     return dp[n-1];
// }
// }
