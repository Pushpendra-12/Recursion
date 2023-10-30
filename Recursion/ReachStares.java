package Recursion;

public class ReachStares {
    public static void main(String[] args) {
        int st = 5;
        System.out.println(Reach(st));

    }

    static int Reach(int stairs)
    {
        if(stairs < 0){
            return 0;
        }
        if(stairs == 0){
            return 1;
        }

        int ans = Reach(stairs -1) + Reach(stairs-2);
        return ans;
    }
}
