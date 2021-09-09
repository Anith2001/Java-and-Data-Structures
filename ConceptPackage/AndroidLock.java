import java.util.*
class AndroidLock{
	static helper(int m,int n){
        int skip[][] = new int[10][10];
        skip[1][3] = skip[3][1] = 2;
        skip[1][7] = skip[7][1] = 4;
        skip[3][9] = skip[9][3] = 6;
        skip[7][9] = skip[9][7] = 8;
        skip[1][9] = skip[9][1] = skip[2][8] = skip[8][2] = skip[3][7] = skip[7][3] = skip[4][6] = skip[6][4] = 5;

        int res=0;
        boolean vis[]=new boolean[10];
        for(int i=m;i<=n;i++){
        	res+=dfs(vis,skip,1,i-1)*4;
        	res+=dfs(vis,skip,2,i-1)*4;
        	res+=dfs(vis,skip,5,i-1);
        }

	}
	public static void main(String[] args) {
		
	}
}