import java.util.*;
class LargestMagicSquare{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=s.nextInt();
			}
		}
		int row[][]=new int[m+2][n+2];
		int col[][]=new int[m+2][n+2];
		int diag[][]=new int[m+2][n+2];
		int rdiag[][]=new int[m+2][n+2];

		for(int i=1;i<m;i++){
			for(int j=1;j<=n;j++){
				row[i][j]+=arr[i-1][j-1]+row[i][j-1];
				col[i][j]+=arr[i-1][j-1]+col[i-1][j];
				diag[i][j]+=arr[i-1][j-1]+diag[i-1][j-1];
				rdiag[i][j]+=arr[i-1][j-1]+rdiag[i-1][j+1];
			}
		}
		int res=0;
		for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                for (int k = Math.min(m - i, n - j); k > res; --k) {
                    int sum = diag[i + k][j + k] - diag[i - 1][j - 1];
                    boolean match = sum == rdiag[i + k][j] - rdiag[i - 1][j + k + 1]; 
                    for (int l = 0; l <= k && match; ++l) {
                        match &= sum == row[i + l][j + k] - row[i + l][j - 1];
                        match &= sum == col[i + k][j + l] - col[i - 1][j + l];
                    }
                    if (match) {
                        res = k;
                        break;
                    }
                }
            }
        }
        System.out.println(res+1);

	}
}