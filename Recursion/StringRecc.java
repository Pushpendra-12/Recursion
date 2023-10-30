package Recursion;

public class StringRecc {
    public static void main(String[] args) {
        String str = "madam";
        int s = 0;
        int e =  str.length()-1;
        boolean ans = isPalindrome(str,s,e);
        System.out.println(ans);

        int a = 2, b = 4;
        System.out.println(power(a, b));
        
    }
    static boolean isPalindrome(String str, int i, int j){
        if(i >= j){
            return true;
        }
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }
        return isPalindrome(str,++i,--j);
    }

    static int power(int a, int b){
        if(b == 0){
            return 1;
        }
        if(b == 1){
            return a;
        }
        int ans = power(a, b/2);
        if(b%2 == 0){
            return ans * ans;
        }
        else{
            return a * ans * ans;
        }
    }
}
