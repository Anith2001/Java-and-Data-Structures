import java.util.*;
class QuickSort{
    static void swap(int arr[],int i1,int j1){
        int temp=arr[i1];
        arr[i1]=arr[j1];
        arr[j1]=temp;
    }
    static int partition(int arr[],int low,int high){
        int left=low,right=high;
        int pivot=arr[low];
        while(left<right){
            while(arr[left]<=pivot && left<high){
                left++;
            }
            while(arr[right]>pivot){
                right--;
            }
            if(left<right){
                swap(arr,left,right);
            }
        }
        arr[low]=arr[right];
        arr[right]=pivot;
        return right;
    }
    static void sort(int arr[],int low,int high){
        int piv_ind;
        if(low<high){
            piv_ind=partition(arr, low, high);
            sort(arr,low,piv_ind-1);
            sort(arr,piv_ind+1,high);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        sort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(partition(arr,0,n-1));
        s.close();
    }
}