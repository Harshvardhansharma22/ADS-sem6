//1) Binary Search

// public class Day3 {
//     public static void main(String[] args){
//         int [] arr ={2,4,6,8,10,12,14,16};
//         int target =12;
//         int low=0,high=arr.length-1;
//         boolean found = false;
//         while (low<=high){
//             int mid = low+(high-low)/2; 
//             if(arr[mid]==target){
//                 System.out.println("Element found at index: "+mid);
//                 found =true;
//                 break;
//             }else if(arr[mid]<target){
//                 low=mid+1;
//             }else{
//                 high=mid-1;
//             }
//             }
//         if(!found){
//             System.out.println("Element not found");
//         }
//     }
// }



// 2)Inherit

// public class Day3{
//     public static void main(String[] args){
//         child c=new child();
//         c.details();
//         c.dsa();
//         c.impl();
// }
// }
// class Parent{
//     void details(){
//         System.out.println("This is  DSA class");
//     }
//     void dsa(){
//         System.out.println("We are learning DSA");
//     }
// }
// class child extends Parent{
//     void impl(){
//         System.out.println("We are implementing dsa using java");
//     }
// }

// 3) Polymorphism

// public class Day3{
//     public static void main(String[]args){
//         Student s=new Student();    
//         s.details();
//         s.details(1);
//         s.details(1,1.5f);
//     }
// }
// class Student{
//     void details(){
//         System.out.println("This is G31");

//     }
//     void details( int a){
//         System.out.println("We are Learning DSA");
//     }
//     void details(int a,float b){
//         System.out.println("We are implementing DSA using Java");
//     }
// }

// 4) Method Overriding

public class Day3{
    public static void main(String[]args){
        Child c =new Child();
        c.details();
    }
}
class Parent{
    void details(){
        System.out.println("We are on Mission");
    }
}
class Child extends Parent{
    @Override
    void details(){
        System.out.println("Mission Completed");
    }
    
}