import java.util.*;
class MergeSort{
    static int count=0;
    static void sort(int arr[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            Merge(arr,l,mid,r);
        }
    }
    static void Merge(int arr[],int l,int m,int r){
        int k=l;
        int n1=m-l+1;
        int n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        
        for(int i=0;i<n1;i++){
            L[i]=arr[i+l];
        }
        for(int i=0;i<n2;i++){
            R[i]=arr[m+i+1];
        }
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
                count+=L.length-i;
            }
            k++;
        }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
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
        System.out.println(count);
        s.close();
    }
}