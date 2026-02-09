//1)Kadane

// public class Day4 {
//     public static void main(String[] args){
// int[]arr={2,4,6,-5,8,9,10};
// int currentSum=arr[0];
// int maxSum=arr[0];
// for(int i=1;i<arr.length;i++){
//     currentSum=Math.max(arr[i], currentSum+arr[i]);
//     maxSum=Math.max(maxSum,currentSum);
// }
// System.out.println("maximum Subarray sum is "+maxSum);
//     }
// }


//2) Circular

public class Day4{
    public static void main(String[]args){
        int []arr={8,-1,3,4};
        int totalSum=0;
        int maxSum=arr[0],currentMax=arr[0];
        int minSum=arr[0],currentMin=arr[0];
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
            if(i>0){
                currentMax=Math.max(arr[i], currentMax+arr[i]);
                maxSum=Math.max(maxSum,currentMax);

                currentMin=Math.min(arr[i], currentMin+arr[i]);
                minSum=Math.min(minSum, currentMin);
            }
        }
        int circularSum=totalSum-minSum;
        System.out.println("Maximum sum of circular subarray is "+Math.max(maxSum, totalSum-minSum));
    }
}