package Recursion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationOfString {
    public static void main(String[] args) {
        String str = "ABC";
        List<String>  l1 = findPermutation(str);
        System.out.println(l1);
        
    }

    static List<String> findPermutation(String str)
    {
        List<String> ans = new ArrayList<>();
        solve(ans,0,str.toCharArray());
        Collections.sort(ans);
        return ans;
        
    }
    static void solve(List<String> l1, int index, char[] str)
    {
        if(index == str.length){
            String s = "";
            for(int i=0;i<str.length;i++){
                s += str[i];
            }
            if(l1.contains(s) == false){
                l1.add(s);
                return;
            }
        }

        for(int i=index;i<str.length;i++){
            swap(str,index,i);
            solve(l1,index+1,str);
            swap(str,index,i);
        }
    }

    static void swap(char[]str,int index,int i)
    {
        char temp = str[index];
        str[index] = str[i];
        str[i] = temp;
    }
}
