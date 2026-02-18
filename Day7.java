

//1)Find the Index of the First Occurrence in a String

// class Solution {
//     public int strStr(String haystack, String needle) {
   
//     if (needle.length() == 0) return 0;
//         for(int i=0;i<=haystack.length()-needle.length();i++){
//             int j;
//             for (j = 0; j < needle.length(); j++) {
//                 if(haystack.charAt(i+j)!=needle.charAt(j)){
//                     break;
//                 }
//             }
//             if (j == needle.length()) {
//                 return i;
//             }
//         }
//         return -1;
//         //haystack=hello
//         //needle=ll
//         //haystack=5
//         //max starting index=5-2=3
//         ////0,1,2,3

//     }
// }



//2)Repeated DNA Sequences


// class Solution {
//     public List<String> findRepeatedDnaSequences(String s) {
//         int n=s.length();
//         int window=10;
//         List<String>result=new ArrayList<>();
//         if(n<window)return result;
//         Map<Character,Integer>map=new HashMap<>();
//         map.put('A',0);
//         map.put('C',1);
//         map.put('G',2);
//         map.put('T',3);
//         int base=4;
//         int hash=0;
//         int power=1;
//         for(int i=0;i<window-1;i++){
//             power*=base;
//         }
//         Set<Integer>seen=new HashSet<>();
//         Set<String>added=new HashSet<>();
//         for(int i=0;i<window;i++){
//             hash=hash*base+map.get(s.charAt(i));
//         }
//         seen.add(hash);
//         for(int i=window;i<n;i++){
//             hash=hash-map.get(s.charAt(i-window))*power;
//             hash=hash*base+map.get(s.charAt(i));
//             if(seen.contains(hash)){
//                 String substring=s.substring(i-window+1,i+1);
//                 added.add(substring);

//             }else{
//                 seen.add(hash);
//             }
//         }
//         result.addAll(added);
//         return result;
        
//     }
// }