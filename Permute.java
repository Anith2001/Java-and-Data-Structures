import java.util.*;
class Permute{
    static void nextPermutation(int arr[]){
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=arr.length-1;
            while(j>=0 && arr[j]<=arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length-1);
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int arr[],int i,int j){
        while(i<j){
            swap(arr,i++,j--);
        }
    }
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}