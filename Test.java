import java.io.*;
class Test{
	int err() throws Exception{
		try{
			throw new IOException("...");
			
		}
		catch(RuntimeException e){
			throw new RuntimeException(e);
		}
		finally{
			return -1;
		}
	}
	public static void main(String[] args) throws Exception{
		System.out.println(new Test().err());
	}
}