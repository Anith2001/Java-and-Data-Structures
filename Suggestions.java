import java.util.*;
class Suggestions{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str[]=new String[5];
		for(int i=0;i<5;i++){
			str[i]=s.next();
		}
		PriorityQueue<String>pq=new PriorityQueue<>(5,(s1,s2)->s1.compareTo(s2));
		for(int i=0;i<5;i++){
			pq.add(str[i]);
		}
		System.out.println(pq);
	}
}