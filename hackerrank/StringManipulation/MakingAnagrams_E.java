package hackerrank.StringManipulation;

/*
 * Example

string a: a string 'cde'
string b: another string 'dcf'
Delete  from  and  from  so that the remaining strings are  and  which are anagrams. 
This takes  character deletions.
output 4
 */


import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        String a = "dfe";
        String b = "cdf";
        System.out.println(makeAnagram(a, b));
    }
    
    public static int makeAnagram(String a, String b) {
         for (int i=0;i<a.length();i++)
        {
            if (b.contains(String.valueOf(a.charAt(i))))
            {
                b=b.replaceFirst(String.valueOf(a.charAt(i)), "");
                a=a.replaceFirst(String.valueOf(a.charAt(i)), "");
                i-=1;
            }
        }
       return (a.length()+b.length());
    }
}
