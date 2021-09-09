import java.util.function.*;
import java.util.*;
class Predicate1{
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Predicate<Integer>pred=(i)->(i%2==0);
		for(Integer i:list){
			if(pred.test(i)){
				System.out.print(i+" ");
			}
		}
		List<Integer>al=new ArrayList<Integer>();
		for(int i=1;i<=10;i++){
			al.add(i);
		}
		System.out.println(al);
		al.removeIf(n->n%2==0);
		System.out.println(al);
	}
}