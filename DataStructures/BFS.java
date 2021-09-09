import java.util.*;
class BFS{
	static boolean visited[];
	static ArrayList<Integer>adj[];
	static void bfs(int k){
		Queue<Integer>queue=new LinkedList<>();
		visited[k]=true;
		queue.add(k);
		while(queue.size()!=0){
			k=queue.poll();
			System.out.print(k+" ");
			for(int j:adj[k]){
				if(!visited[j]){
					visited[j]=true;
					queue.add(j);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		adj=new ArrayList[n];
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
		bfs(0);
	}
}