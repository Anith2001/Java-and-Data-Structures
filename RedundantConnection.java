import java.util.*;
class RedundantConnection{
	static int parent[];
	static void union(int a,int b){
		a=find(a);
		b=find(b);
		if(a!=b){
			parent[b]=a;
		}
	}
	static int find(int v){
		if(parent[v]==v){
			return v;
		}
		return parent[v]=find(parent[v]);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int f=s.nextInt();
		int arr[][]=new int[f][2];
		for(int i=0;i<f;i++){
			arr[i][0]=s.nextInt();
			arr[i][1]=s.nextInt();
		}
		parent=new int[f+1];
		for(int i=1;i<=f;i++){
			parent[i]=i;
		}
		for(int i=0;i<f;i++){
			union(arr[i][0],arr[i][1]);
		}
		System.out.println(Arrays.toString(parent));
	}
}