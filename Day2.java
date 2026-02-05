// public class Day2 {
//     public static void main(String[] args){
//         int []arr={2,4,1,3,5};
//         int n=arr.length;
//         int[]prefix=new int[n];
//         prefix[0]=arr[0];
//         for(int i=1;i<n;i++){
//             prefix [i]=prefix[i-1]+arr[i];
//         }
//         int l=1,r=3;
//         int sum;
//         if(l==0){
//             sum=prefix[r];
//         }else{
//             sum=prefix[r]-prefix[l-1];
//         }
//         System.out.println(sum);
//     }
// }

//2)

// public class Day2 {
//     public static void main(String[] args) {
//         int[] arr = { 2, 4, 6, 2, 4 };
//         int n = arr.length;
//         int[] prefix = new int[n];
//         int[] suffix = new int[n];
//         prefix[0] = arr[0];
//         for (int i = 1; i < n; i++) {
//             prefix[i] = prefix[i - 1] + arr[i];
//         }
//         suffix[n - 1] = arr[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             suffix[i] = suffix[i + 1] + arr[i];
//         }
//         for (int i = 0; i < n; i++) {
//             int leftSum = (i == 0) ? 0 : prefix[i - 1];
//             int rightSum = (i == n - 1) ? 0 : suffix[i + 1];
//             if (leftSum == rightSum) {
//                 System.out.println("Equilibrium index: " + i);
//                 return;
//             }
//         }
//     }
// }


//3)
public class Day2{
    public static void main(String[]args){
        int [] arr={1,3,4,-1,-5,2,6,0};
        int totalSum=0;
        for(int num:arr){
            totalSum+=num;
        }
        if(totalSum%3!=0){
            System.out.println(false);
            return;
        }
        int partSum=totalSum/3;
        int currentSum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            if(currentSum==partSum){
                count++;
                currentSum=0;
            }
        }
        System.out.println(count>=3);
    }
}