package Recursion;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {2,1,9,7,6};
        // boolean res = isSort(arr,arr.length);
        // System.out.println(res);
        //
        System.out.println(ArrSum(arr,arr.length));
        int k = 6;
        System.out.println(LeanearSearch(arr, k, arr.length));

        
    }

    static boolean isSort(int[] arr, int size){
        if(size == 0 || size == 1 ){
            return true;
        }
        if(arr[0] > arr[1]){
            return false;
        }

        int newArr[] = new int[size - 1];
        System.arraycopy(arr, 1, newArr, 0, size-1);
        boolean ans = isSort(newArr, size-1);
        return ans;
    }

    static int ArrSum(int arr[], int size){
       
        if(size <=0){
            return 0;
        }
        return arr[size - 1] + ArrSum(arr, size-1);

    }

    static boolean LeanearSearch(int[] arr, int key, int size){
       
        if(size == 0){
            return false;
        }
        if(arr[0] == key){
            return true;
        }
        int A[] = new int[size-1];
        System.arraycopy(arr,1,A,0,size-1);
        return LeanearSearch(A, key, size-1);
    }
}
