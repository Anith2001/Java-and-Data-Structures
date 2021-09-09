class Bear{
	public final void eat(){
		System.out.println("bear is eating");
	}
}
class Panda extends Bear{
	public  void eat(){
		System.out.println("panda is eating");
	}
	public static void main(String[] args) {
		Panda p=new Panda();
		p.eat();
	}
}