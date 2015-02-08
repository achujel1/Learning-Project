
public class Calculator {
	public void addition(int a, int b) {
			System.out.println(a + b);
	}
	public void minus(int a, int b) {
		System.out.println(a - b);
	}
	// method which is going to convert number from double to integer
	// and printing it out
	public void convertingDoubleToInt(double a) {
		// here we are using casting
		int intResult = (int)a;
		System.out.println("Converted double to integer number: " 
				+ intResult);
	}
	public void convertingIntToDouble(int a) {
		// here we are casting from integer to double value
		double doubleResult = a;
		System.out.println("Converted integer to double number: " 
				+ doubleResult);
	}
	public void convertingDoubleToIntWithHelperClass(double a) {
		Double doubleObj = new Double(a);
		int intResult = doubleObj.intValue();	
		System.out.println("Converted integer to double number using helper class: " 
				+ intResult);
	}
}
