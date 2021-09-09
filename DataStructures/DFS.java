import java.util.*;
class DFS{
	static boolean visited[];
	static void dfs(int k,ArrayList<Integer>adj[]){
		visited[k]=true;
		System.out.print(k+" ");
		for(int j:adj[k]){
			if(!visited[j]){
				dfs(j,adj);
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer>adj[]=new ArrayList[n];
		for(int i=0;i<n;i++){
			adj[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<n;i++){
			int a=s.nextInt();
			int b=s.nextInt();
			adj[a].add(b);
			adj[b].add(a);
		}
		visited=new boolean[n];
		dfs(0,adj);
	}
}