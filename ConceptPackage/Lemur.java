class Primate{
	void fun(){
		System.out.println("primate");
	}
}
class Lemur extends Primate{
	void fun() throws IllegalStateException{
		System.out.println("lemur");
	}
	public static void main(String[] args) {
		Lemur l=new Lemur();
	}
}