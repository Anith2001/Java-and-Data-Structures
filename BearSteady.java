import java.util.*;
class BearSteady{
	static boolean isBalanced(int c,Map<Character,Integer>m){
		if(m.get('A')<=c && m.get('C')<=c && m.get('G')<=c && m.get('T')<=c){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=s.next();
		int i=0,j=0;
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		map.put('A',0);
		map.put('T',0);
		map.put('C',0);
		map.put('G',0);
		for(int c=0;c<n;c++){
			map.put(str.charAt(c),map.getOrDefault(str.charAt(c),0)+1);
		}
		int count=n/4;
		int min=Integer.MAX_VALUE;
		while(i<n && j<n){
			if(!isBalanced(count,map)){
				map.put(str.charAt(j),map.get(str.charAt(j))-1);
				j++;
			}
			else{
				min=Math.min(min,j-i);
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
				i++;
			}
			System.out.print("i = "+i);
			System.out.println("j = "+j);
		}
		System.out.println(map);
	}
}