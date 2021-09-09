import java.util.*;
class GraphColoringDec{
	static int V;
	static int color[];
	static void helper(int graph[][],int m){
		color=new int[V];
		Arrays.fill(color,0);

		if(!colorGraph(graph,m,color,0)){
			System.out.println("No solution is possible");
		}
		for(int i=0;i<color.length;i++){
			System.out.print(color[i]+" ");
		}
	}
	static boolean colorGraph(int graph[][],int m,int color[],int v){
		if(v==V){
			return true;
		}
		for(int c=1;c<=m;c++){
			if(isSafe(graph,v,c,color)){
				color[v]=c;
				if(colorGraph(graph,m,color,v+1)){
					return true;
				}
				color[v]=0;
			}
		}
		return false;
	}
	static boolean isSafe(int graph[][],int v,int c,int color[]){
		for(int i=0;i<V;i++){
			if(graph[v][i]==1 && c==color[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		V=s.nextInt();
		int m=s.nextInt();
		int graph[][]=new int[V][V];
		for(int i=0;i<V;i++){
			for(int j=0;j<V;j++){
				graph[i][j]=s.nextInt();
			}
		}
		helper(graph,m);
	}
}