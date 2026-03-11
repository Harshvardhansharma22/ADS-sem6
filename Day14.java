// 1)

// import java.util.Stack;

// public class Day14 {
//     public boolean isValid(String s) {
//         Stack<Character> st = new Stack<>();
//         for (char c : s.toCharArray()) {
//             if (c == '(' || c == '{' || c == '[') {
//                 st.push(c);
//             } else {
//                 if (st.isEmpty()) 
//                     return false;
//                 char top = st.pop();
//                 if (c == ')' && top != '(') return false;
//                 if (c == '}' && top != '{') return false;
//                 if (c == ']' && top != '[') return false;
//                 }
//             }
//         return st.isEmpty();
//     }
// }


// 2)

// class Solution{
//     public String removeDuplicate(String s) {
//         Stack<Character> st= new Stack<>();
//         for(char c:s.toCharArray()){
//             if(!st.isEmpty()&&st.peek()==c)
//                 st.pop();
//                 else
//                     st.push(c);
//         }
//         StringBuilder sb=new StringBuilder();
//         for(char c:st)
//             res.append(c);
//         return res.toString();
//     }
// }

// 3)

// class Solution {
//     public int calPoints(String[] operations) {
//         Stack<Integer>st=new Stack<>();
//         for(String a:operations){
//             if(a.equals("C")){
//                 st.pop();
//             }else if(a.equals("D")){
//                 st.push(st.peek()*2);
//             }else if(a.equals("+")){
//                 int last = st.pop();
//                 int updatedScore=last+st.peek();
//                 st.push(last);
//                 st.push(updatedScore);
//             }else{
//                 st.push(Integer.parseInt(a));
//             }
//         }
//         int sum =0;
//         for(int num:st)
//         sum+=num;
//         return sum;
//     }
// }