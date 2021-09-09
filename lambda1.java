import java.util.*;
interface MathOperation{
	int operation(int a,int b);
}
class lambda1{
	private int operate(int a,int b,MathOperation math){
		return math.operation(a,b);
	}
	public static void main(String[] args) {
		lambda1 d1=new lambda1();
		MathOperation add=(int a,int b)->{ return a+b;};
		MathOperation diff=(a,b)->a-b;
		MathOperation mul=(a,b)->a*b;
		MathOperation div=(a,b)->a/b;
		System.out.println(d1.operate(10,20,add));
		System.out.println(d1.operate(20,10,diff));
		System.out.println(d1.operate(10,20,mul));
		System.out.println(d1.operate(20,10,diff));
	}
}