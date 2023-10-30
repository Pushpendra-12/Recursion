package Recursion;

public class factorial {
    public static void main(String[] args) {
        // System.out.println(solution(6));

         count(5);

        //System.out.println(fibonacci(2));
    }

    static int solution(int n){
        if(n == 1){
            return 1;
        }
        return n * solution(n-1);
    }

    static int power(int n){
        if(n == 0){
            return 1;
        }
        return 2 * power(n-1);
    }

    static void count(int n){
        if(n == 0){
            return;
        }
        count(n-1);
        System.out.println(n);
    }

    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
