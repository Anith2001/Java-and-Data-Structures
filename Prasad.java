import java.util.*;
class Prasad{
    static void Permutation(String str,int res[],int n){
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='D'){
                int j=i;
                while(i<n && str.charAt(i)=='D'){
                    i++;
                }
                reverse(res,j,i);
            }
        }
    }
    static void reverse(int res[],int st,int end){
        while(st<end){
            int temp=res[st];
            res[st]=res[end];
            res[end]=temp;
            st++;
            end--;
        }
    }
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int n=str.length();
        int res[]=new int[n+1];
        for(int i=0;i<=n;i++){
            res[i]=i+1;
        }
        Permutation(str,res,n);
        System.out.println(Arrays.toString(res));
    }
}