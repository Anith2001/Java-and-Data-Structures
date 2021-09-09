class Mammal{
	Mammal(){
		System.out.println("mammal constructor");
	}
}
class Mammal1 extends Mammal{
	Mammal1(){
		System.out.println("mammal1 constructor");
	}
}
class Mammal2 extends Mammal1{
	Mammal2(){
		System.out.println("mammal2 constructor");
	}
}
class Elephant extends Mammal2{
	public static void main(String[] args) {
		new Elephant();
	}
}