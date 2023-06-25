/*

First Unique Character in a String

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

*/

class SolutionExamQ2{
    public static int firstUniqChar(String s) {
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            flag=0;
           for(int j=0;j<s.length();j++)
           {
               if(i==j)
               continue;
               if(s.charAt(i)==s.charAt(j))
               {
                  flag=1;
                  break;
               }
               
           }
           if(flag==0)
           {
               return i;
           }
        
        
        }
        
        return -1;
    }

    public static void main(String ar[])
   {	
	String s="loveleetcode";
	System.out.println("First Unique Character index is :"+firstUniqChar(s));
	

   }
}