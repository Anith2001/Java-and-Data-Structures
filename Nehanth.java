import java.util.*;
class Nehanth{
	static List<Integer>ans;
	static void backtrack(int num,int digit,int low,int high){
		if(num>high){
			return ;
		}
		else{
			if(num>=low && num<=high){
				ans.add(num);
			}
			if(digit<9){
				backtrack((num*10+(digit+1)),digit+1,low,high);
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int low=s.nextInt();
		int high=s.nextInt();
		ans=new ArrayList<Integer>();
		for(int i=1;i<9;i++){
			backtrack(i,i,low,high);
		}
		Collections.sort(ans);
		System.out.println(ans);
	}
}