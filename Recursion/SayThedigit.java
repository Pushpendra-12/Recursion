package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SayThedigit {
    public static void main(String[] args) {
        String arr[] = {"zero","one","two","three","four"};
        Say(123,arr);

        //UsingMap(123);
        
    }

    static void Say(int n , String []arr){
        if(n == 0){
            return ;
        }

        int digit = n % 10;
        n /= 10;
        Say(n, arr);
        System.out.print(arr[digit] + " ");
    }

    static void UsingMap(int n){
        HashMap<Integer,String> map = new HashMap<>();
        ArrayList<String> l1 = new ArrayList<>();
        map.put(0,"zero");
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");

        while(n != 0){
            int digit = n % 10;
            n /= 10;
            if(map.containsKey(digit)){
                l1.add(map.get(digit));   
            }
        }
        Collections.reverse(l1);
        for(String val : l1){
            System.out.print(val + " ");
        }
        // System.out.println(l1);
    }
}
