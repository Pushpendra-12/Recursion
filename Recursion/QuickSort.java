package Recursion;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {2,1,6,4,8,3};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
       
        
    }
    static void quickSort(int arr[], int st, int ed)
    {
        if(st >=  ed){
            return;
        }

        int p = Partion(arr, st, ed);
        quickSort(arr, st, p-1);
        quickSort(arr, p+1, ed);
    }

    static int Partion(int arr[], int st, int ed)
    {
        int pivot = arr[st];
        
        int i = st;
        for (int j = st + 1; j <= ed; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    
        // Swap arr[st] and arr[i]
        int temp = arr[st];
        arr[st] = arr[i];
        arr[i] = temp;
        
        //swap(arr[st], arr[i]);
        return i;
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
