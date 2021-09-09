import java.util.*;
class Permute{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int flag=1;
		for(int i=0;i<s1.length();i++){
			if(arr1[i]!=arr2[i]){
				flag=0;
				break;
			}
		}
		if(flag==1){
			System.out.println("they are permutaions of eachother");
		}
		else{
			System.out.println("they are not");
		}
		ArrayList li=new ArrayList();
		li.add("kumar");
		li.add("anith");
		Collections.sort(li);
	}
}