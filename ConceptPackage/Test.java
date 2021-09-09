class Fish{
	protected int size;
	private int age;
	Fish(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}
class Shark extends Fish{
	private int nfins=8;
	Shark(int age){
		super(age);
		this.size=4;
	}
	public void display(){
		System.out.println("Shark Age = "+super.getAge());
		System.out.println("Size = "+super.size);
		System.out.println("Fins = "+this.nfins);
	}
}
class Test{
	public static void main(String[] args) {
		Shark s=new Shark(10);
		s.display();
	}
}