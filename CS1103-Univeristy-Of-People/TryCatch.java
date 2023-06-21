package example;
public class TryCatch {
	public static void main(String[] args) {
		double [][] M = new double[1][1];
		try {
			double determinant = M[0][0]*M[1][1] - M[0][1]*M[1][0];
			System.out.println("The determinant of M is " + determinant);
			}
			catch ( ArrayIndexOutOfBoundsException e ) {
			System.out.println("M is the wrong size to have a determinant.");
			e.printStackTrace();
		}
		int a = 4;
		int b = 0;
		try {
			divide(a, b);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("Hello World");
		}
	}
	static int divide(int a, int b) throws ArithmeticException {
		if ( b == 0) {
			throw new ArithmeticException("Please do not divide by 0");
		}
		return a / b;
	}
}
