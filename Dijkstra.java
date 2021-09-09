import java.util.*;
class Dijkstra{
	static void dijkstra(int arr[][],int source){
		int len=arr.length;
		boolean visited[]=new boolean[len];
		int distance[]=new int[len];
		Arrays.fill(distance,Integer.MAX_VALUE);

		distance[source]=0;
		for(int i=0;i<len;i++){
			int u=findMinDistance(distance,visited);
			visited[u]=true;
			for(int v=0;v<len;v++){
				if(!visited[v] && arr[u][v]!=0 &&(distance[u]+arr[u][v]<distance[v])){
					distance[v]=distance[u]+arr[u][v];
				}
			}
		}
		for(int i=0;i<distance.length;i++){
			System.out.println(String.format("Distance from %s to %s is %s",source,i,distance[i]));
		}
	}
	static int findMinDistance(int distance[],boolean visited[]){
		int min=Integer.MAX_VALUE;
		int min_index=-1;
		for(int i=0;i<distance.length;i++){
			if(!visited[i] && distance[i]<min){
				min=distance[i];
				min_index=i;
			}
		}
		return min_index;
	}
	public static void main(String[] args) {
		int graph[][] = new int[][] {{ 0, 0, 1, 2, 0, 0, 0 }, 
		{ 0, 0, 2, 0, 0, 3, 0 }, 
		{ 1, 2, 0, 1, 3, 0, 0 },
        { 2, 0, 1, 0, 0, 0, 1 }, 
        { 0, 0, 3, 0, 0, 2, 0 }, 
        { 0, 3, 0, 0, 2, 0, 1 }, 
        { 0, 0, 0, 1, 0, 1, 0 }};

        dijkstra(graph,0);
	}
}