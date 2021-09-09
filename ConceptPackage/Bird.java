class Bird{
	protected void show()throws Exception{
		System.out.println("Bird");
	}
}
class Parrot extends Bird{
	public void show(){
		System.out.println("parrot");
	}
}
class Main{
	public static void main(String[] args) {
		Parrot p=new Parrot();
		p.show();
	}
}