package Recursion;

import java.util.HashSet;
import java.util.Scanner;

public class Coom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(solve(str1, str2));
        sc.close();
    }
    public static String solve(String s1, String s2) {
        HashSet<Character> hs1 = new HashSet<>();
        HashSet<Character> hs2 = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            hs1.add(ch);
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            hs2.add(ch);
        }
        hs1.retainAll(hs2);
        return hs1.toString();
    }
}
