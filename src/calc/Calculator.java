package calc;
// importing Date library
// importing other libraries for string input
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

import com.lynda.olivepress.olives.Olive;

public class Calculator {

	public static final int MAINVALUE = 0;
	protected static final String NAME = "this is your name";
	protected static final String SURNAME = "this is your surnam";

	double number;

	private int mainValue = Calculator.MAINVALUE;

	public Calculator(double number){
		System.out.println("number is: " + number);
		setNumber(number);
	}

	public void setNumber(double number){
		this.number = number;
	}

	public double getNumber(){
		return number;
	}

	public int getMainValue() {
		return mainValue;
	}

	private void setMainValue(int mainValue) {
		this.mainValue = mainValue;
	}

	public Calculator(int mainValue) {
		super();
		this.mainValue = mainValue;
	}

	public Calculator() {
		// TODO Auto-generated constructor stub
		setMainValue(10);
	}
	

	public int mainValuePlusOne() {
		// TODO Auto-generated method stub
		mainValue = mainValue + 1;
		System.out.println(mainValue);
		return mainValue;
	}

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
	public static String getInput(String prompt) {
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

	// method which's arguments are infinite (not actually)
	// number of double type arguments
	public void addMultipleValues(double ... values) {
        double result = 0d;
        for (double d : values) {
                result +=d;
        }
        System.out.println("The answer from multiple values are: " + result);
//        return result;
	}

	// working with method overloading
	public static int addValues(int int1, int int2){
		return int1 + int2;
	}

	public static int addValues(int int1, int int2, int int3){
		return int1 + int2 + int3;
	}
	
	public static int addValues(String val1, String val2) {
		int value1 = Integer.parseInt(val1);
		int value2 = Integer.parseInt(val2);
		return value1 + value2;
	}

	// working with string change
	// copy by reference in Java
	public static void changeString(String random){
		System.out.println("Old string inside the function: " + random);
		random = "New!";
		// I see here that String has changed
		System.out.println("Changed string inside the function: " + random);
	}

	public static void changeArrayValue(int[] random) {
		System.out.println("Before change array[0] value inside the function: " + random[0]);
		// testing if changing the value works inside the function
		random[0] ++;
		System.out.println("Changed array[0] value inside the function: " + random[0]);
	}

	public static double divideNumbers(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 / d2;
		return result;
	}

	public static double multiplyNumbers(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 * d2;
		return result;
	}

	public static double subtractNumbers(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 - d2;
		return result;
	}

	public static double addingNumbers(String s1, String s2)
			throws NumberFormatException {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 + d2;
		return result;
	}

	// just testing if how equals method works with strings
	public static void checkingIfEqual(String s1, String s2) {
		if(s1.equals(s2)){
			System.out.println(s1 + " is equal to " + s2 + ".");
		}else if(s1.equalsIgnoreCase(s2)){
			System.out.println(s1 + " is equal but not EQUAL to " + s2 + ".");
		}else {
			System.out.println("Strings aren't equal!");
		}
	}

	// this is just a method to sum two strings into one
	public static void addingToAnother(String s1, String s2) {
		StringBuilder sb = new StringBuilder(s1);
		// Using append String Builder class and append() method
		sb.append(s2);
		System.out.println(sb);
	}
	
	// testing string parsing
	public static void informationAboutString(String s1, String s2) {
		System.out.println("Length of the string: " + s1.length());
		System.out.println("Position of string " + s2 + " is at: " + s1.indexOf(s2));
		System.out.println("First strsng: " + s1 + ". First string left with only second string: " + s1.substring(s1.indexOf(s2)));
	}

	// testing how date works
	public static void gettingTheDate(){
		Date d = new Date();
		System.out.println("Today's date: " + d);
	}

	// making string null
	public static void makingStringNull(String s1) {
		s1 = null;
		System.out.println(s1);
	}

	// testing how code will be handled when error occurs
	public static void willMakeAnError(){
		try {
			String[] random = {"Hello", "Hey"};
			System.out.println(random[2]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// commenting printStackTrace() out just to see a better view
//			e.printStackTrace();
			System.out.println("There was an error");
		}
	}

	// testing how exception throwing works
	public static void getArrayItem() 
		throws ArrayIndexOutOfBoundsException {
		String[] strings = {"Welcome!"};
		System.out.println(strings[1]);
	}

	// testing how debugger works
	public static void debuggerTest(){
		
	}

	public static void randomTestWithNumbers(int a, int b) {
		a = a + 1;
		b = b + 1;
	}
	public int returningOneBigger(int b){
		return b + 1;
	}

	// little experiment with debugger
	public static void debuggerExperiment() {
        try{
                URI uri = new URI("http:\\somecompany.com");
        }catch(URISyntaxException e){
                System.out.println(e.getMessage());
        }
        
        System.out.println("I'm alive!");
	}	

	// working with arrays
	public static void printingAnArray(){
		int[] a1 = new int[3];
		// testing how array works
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		
		// you can also declare an array like this
		int a2[] = new int[3];
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}
	}

	// printing an 2D array
	public static void printing2DArray(){
		String[][] coordinates = new String[3][2];
		coordinates[0][0] = "0, 0";
		coordinates[0][1] = "0, 1";
		coordinates[1][0] = "1, 0";
        coordinates[1][1] = "1, 1";
        coordinates[2][0] = "2, 0";
        coordinates[2][1] = "2, 1";
        for (int i = 0; i < coordinates.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < coordinates[i].length; j++) {
				if (j == 0) {
					sb.append("First coordinate is ");
				} else {
					sb.append(" and the second is ");
				}
				sb.append(coordinates[i][j]);
			}
			System.out.println(sb);
		}

	}

	// let's see how array list works
	public static void testingArrayList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("First value");
		list.add("Second value");
		list.add("Third value");

		System.out.println(list);

		list.add("Fourth value");
		System.out.println(list);

		list.remove(0);
		System.out.println(list);
		
		String value = list.get(1);
		System.out.println("The second value is: " + value);

		int pos =list.indexOf("Third value");
		System.out.println("Third value is at position: " + pos);
	}

	// testing how hashMap works
	public static void hashMapTesting(){
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("California", "Sacremento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		
		System.out.println(map);

		map.put("Alaska", "Juneau");
		System.out.println(map);
		
		String cap = map.get("Oregon");
		System.out.println("The capital of Oregon is: " + cap);

		map.remove("California");
		System.out.println(map);

	}

	// testing how iterators wokr
	public static void testingIteratorWorking() {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("First value");
		list.add("Second value");
		list.add("Third value");
		System.out.println(list);
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String value = listIterator.next();
			System.out.println(value);
		}
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("First", "value");
		map.put("Second", "value");
		map.put("Third", "value");
		System.out.println(map);
		Set<String> keys = map.keySet();
		Iterator<String> iterator = keys.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println("The capital of " + value + " is " + map.get(value));
		}

		
	}

	// testing instances of a method
	public void instanceOfAMethod(){
		System.out.println("This is an instance of a method!");
	}

	public int sumOfTheArray(ArrayList<Addition> numbers){
		int sumOfTheNumbersArray = 0;
		
		for (Addition olive : numbers) {
			sumOfTheNumbersArray += number;
		}
		
		return sumOfTheNumbersArray;
	}

}