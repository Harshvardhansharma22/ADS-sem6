//1)

// public class Day17 {
//     public static int minCost(int[]cost){
//         int n=cost.length;
//         int[]dp=new int[n];
//         dp[0]=cost[0];
//         dp[1]=cost[1];
//         for(int i=2;i<n;i++){
//             dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
//         }
//         return Math.min(dp[n-1],dp[n-2]);
//     }
//     public static void main(String[] args){
//         System.out.println("Try progtamiz.pro");
//         //cost = [10,15,20]
//         //step1=10
//         //step2=15
//         //step3=20

//         int[]cost={10,15,20};
//         System.out.println("The minimum cost is:"+minCost(cost));
//     }
// }


//2)

// public class Day17{
//     public static int coinChange(int[]coins,int am){

//         // dp=[0,inf,inf,inf,inf,inf,inf,inf,inf,inf,inf,inf]
//         // i=1
//         // dp[1]=1
//         // dp[]=[0,1,inf...........]
//         // i=2
//         // coin1..1+dp[1]=2
//         // coin2..1+dp[0]=1

//         // dp[]=[0,1,inf.........]

//         // i=3
//         // coin1....2
//         // coin2....1
//         // dp=[0,1,1,2,inf...........] 

//         // i=4
//         // best=2
//         // dp[]=[0,1,1,2,2,inf.....] 

//         // i=5
//         // coins..1
//         // dp[]=[0,1,1,2,2,1...inf1.....] 

//         // i=6
//         // 5+1=2
//         // dp[]=[0,1,1,2,2,1,2,inf.....]
//         // i=7


//         int[]dp=new int [am+1];
//         for(int i=0;i<=am;i++){
//             dp[i]=am+1;
//         }
//         dp[0]=0;
//         for(int i=1;i<=am;i++){
//             for(int c:coins){
//                 if(i-c>=0){
//                     dp[i]=Math.min(dp[i],+dp[i-c]);
//                 }
//             }
//         }
//         return dp[am]>am?-1:dp[am];
//     }
//     public static void main(String[] args) {
//         System.out.println("Try progtamiz.pro");
//         int[]coins={1,2,5};
//         int am=11;
//         System.out.println("The minimum coins required is:"+coinChange(coins,am));
//     }
// }
