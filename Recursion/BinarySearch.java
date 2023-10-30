package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80};
        int size = arr.length;
        int k = 30;
        System.out.println(Bsearch(arr, k, size));

        boolean res = BsearchUsingRec(arr, 0, size-1, k);
        System.out.println(res);
        
    }

    static boolean BsearchUsingRec(int[] arr,int l, int h, int key){
        if(l > h){
            return false;
        }

        int mid = (l + h)/2;
        if(arr[mid] == key){
            return true;
        }

        if(arr[mid] < key){
            return BsearchUsingRec(arr, mid+1, h, key);
        }else{
            return BsearchUsingRec(arr, l, mid-1, key);
        }
    }

    static int Bsearch(int[] arr, int key, int size){
        int low = 0;
        int high = size-1;
        do {
            int mid = (low + high)/2;
            if(arr[mid] < key){
                low = mid + 1;
            }
            else if(arr[mid] == key){
                return mid;
            }
            else{
                high = mid - 1;
            }
            
        } while (low <= high);
        return -1;
    }


}
