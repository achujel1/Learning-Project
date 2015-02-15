// importing Date library
import java.util.Date;

// importing other libraries for string input
import java.io.*;


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
	
	// converting integer to double
	// as a test
	public void convertingIntToDouble(int a) {
		// here we are casting from integer to double value
		double doubleResult = a;
		System.out.println("Converted integer to double number: " 
				+ doubleResult);
	}
	
	// converting double to integer with a helper class
	public void convertingDoubleToIntWithHelperClass(double a) {
		Double doubleObj = new Double(a);
		int intResult = doubleObj.intValue();	
		System.out.println("Converted integer to double number using helper class: " 
				+ intResult);
	}
	
	// working with addition operator
	public void addingNumbers(int a, int b) {
		int c = a + b;
		System.out.println("Adding two numbers: " + a + " + " + b + " = " + c);
	}
	
	// working with minus
	public void minusNumbers(int a, int b) {
		int c = a - b;
		System.out.println(a + " minus " + b + " will be: " + c);
	}
	
	// working with boolean parser
	public void booleanParser(String s) {
		// prints false unless given String is "true"
		System.out.println(Boolean.parseBoolean(s));
	}
	
	// working with string output and date
	public void dateOutput(String s) {
		// you can get the class you need by clicking ctrl + space
		Date date = new Date();
		System.out.println(s + date);
	}
	
	// working with longs
	public void longPrinter(long l){
		System.out.println(l);
	}
	
	// working with String output 
	public void addingTwoNumbers() {
			String s1 = getInput("Enter a number: ");
			String s2 = getInput("Enter another number: ");
			double d1 = Double.parseDouble(s1);
			double d2 = Double.parseDouble(s2);
			double result = d1 + d2;
			System.out.println("The sum: " + result);
	}
	
	// method to get the input
	private static String getInput(String prompt) {
		// this is a buffer reader that 
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print(prompt);
		System.out.flush();
		try {
			return stdin.readLine();
		} catch(Exception e) {
			return "Error: " + e.getMessage();
		}
	}
	
	// method that is using conditional sentence
	public void ifNumberIsBiggerThen100(double a){
		if (a > 100) {
			System.out.println("Your number is more than 100: " + a);
		} else if (a <= 100 && a >= 10){
			System.out.println("Your number is between 10 and 100: " + a);
		} else {
			System.out.println("Your number is less than 10: " + a);
		}
	}
	
	// method that is checking if entered String was correct
	public void ifStringIsTrue(String a){
		if (a.equals("ture")) {
			System.out.println("This string is true: " + a);
		} else {
			System.out.println("This is not true string: " + a);
		}
	}

	// method to uses switch
	public void switchingAction(int a, int b) {
		String input = getInput("Enter the action you want to do (add/minus): ");
		switch(input) {
		case "add":
			addingNumbers(a, b);
			break;
		case "minus":
			minusNumbers(a, b);
			break;
		default:
			System.out.println("You entered not 'add' or 'minus'");
			break;
		}
	}	

	// method that uses switch and enums
	public void switchingActionUsingEnums(int a, int b) {
		//String  = getInput("Enter the action you want to do (add/minus): ");
		Action action = Action.ADDITION;
		switch(action) {
		case ADDITION:
			addingNumbers(a, b);
			break;
		case MINUS:
			minusNumbers(a, b);
			break;
		default:
			System.out.println("You entered not 'add' or 'minus'");
			break;
		}
	}
	
	// testing a method with is using loops
	public void testingLoops(){
		String[] months =
			{"January", "February", "March",
			"April", "May", "June",
			"July", "August", "September",
			"October", "November", "December"};

		// testing for loop
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}

		// testing another way to show for loop
		for (String month : months) {
			System.out.println(month);
		}

		// testing while loop with an integer counter
		int counter = 0;
		while (counter < months.length){
			System.out.println(months[counter]);
			counter++;
		}
		
		// testing a do/while loop with an integer counter1
		int counter1 = 0;
		do {
			System.out.println(months[counter1]);
			counter1++;
		} while (counter1 < months.length);
		
		
	}
}
