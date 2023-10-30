package Recursion;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {12,4,23,2,16,14};
        int n = arr.length;
        divide(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        
    }

    static void divide(int[] arr,int st, int ed)
    {

        if(st >= ed){
            return;
        }

        int mid = st + (ed - st)/2;         // (st + ed)/2 gives space comp sometimes
        divide(arr, st, mid);
        divide(arr, mid+1, ed);

        conquer(arr,st,mid,ed);
    }

    static void conquer(int[] arr, int st, int mid, int ed){
        int merged[] = new int[ed - st + 1];

        int idx1 = st;
        int idx2 = mid + 1;
        int x = 0;

        while(idx1<= mid && idx2<=ed){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
          merged[x++] = arr[idx1++];  
        }
        while(idx2 <= ed){
            merged[x++] = arr[idx2++];
        }

        for(int i=0, j=st; i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }
}
