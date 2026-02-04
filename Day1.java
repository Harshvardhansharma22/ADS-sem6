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