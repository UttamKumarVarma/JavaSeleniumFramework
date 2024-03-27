package test;

public class Exceptionhandling {

	public static void main(String[] args) {
	
		try {
			exceptionMethod();
		} catch (Exception e) {
			System.out.println("Message is "+e.getMessage());
			System.out.println("Cause is "+e.getCause());
			e.printStackTrace();
		}
		finally {
			//throw new ArithmeticException("Code should'nt reach here");
		}

	}
	
	public static void exceptionMethod() throws Exception{
		
		int x=1/0;
	}

}
