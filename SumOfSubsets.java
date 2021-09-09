import java.util.*;
class SumOfSubsets{
	static int sum;
	static int arr[];
	static int x[];
	static List<List<Integer>>helper(int arr[],int n){
		List<Integer>temp=new ArrayList<>();
		int total=0;
		for(int i=1;i<=n;i++){
			total+=arr[i];
		}
		subset(0,1,total,temp);
		return res;
	}
	static void subset(int s,int k,int r,List<Integer>temp){
		x[k]=1;
		int j=0;
		if(s+arr[k]==sum){
			for(j=1;j<=k;j++){
				if(x[j]==1){
					System.out.print(arr[j]+" ");
				}
			}
			System.out.println();
			return ;
		}
		else if(s+arr[k]+arr[k+1]<=sum){
			subset(s+arr[k],k+1,r-arr[k],temp);
		}
		if((s+r-arr[k]>=sum) && (s+arr[k+1]<=sum)){
			x[k]=0;
			subset(s,k+1,r-arr[k],temp);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		arr=new int[n+1];
		x=new int[n+1];
		for(int i=1;i<=n;i++){
			arr[i]=s.nextInt();
		}
		sum=s.nextInt();
		helper(arr,n);
	}
}