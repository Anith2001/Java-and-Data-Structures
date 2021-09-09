import java.util.*;
class Josephproblem{
	static int josephCircle(int n,int k){
		if(n==1){
			return 0;
		}
		int x=josephCircle(n-1,k);
		System.out.println("x = "+x);
		System.out.println("n = "+n);
		int y=(x+k)%n;
		return y;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		//System.out.println();
		josephCircle(n,k);
	}
}