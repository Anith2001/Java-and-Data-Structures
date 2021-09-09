class Exception4{
	public static void main(String[] args) {
		try{
			try{
				throw new ArrayIndexOutOfBoundsException();
			}
			catch(ArithmeticException e1){
				System.out.println("Inner Catch");
			}
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("outer catch");
		}
	}
}