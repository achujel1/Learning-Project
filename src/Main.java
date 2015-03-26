import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import calc.ActionAdding;
import calc.Addition;
import calc.AdditionTwo;
import calc.Calculator;
import calc.files.FileWriting;

public class Main {
	public static void main(String[] args) {
		// testedMethods(args);
		
		
		System.out.println("Calculator");
	}

	/**
	 * 
	 */
	private static void testingFileManagement() {
		FileWriting f = new FileWriting();
		f.fileWriting();
	}

	/**
	 * 
	 */
	private static void testingHowInterfaceWorks() {
		ActionAdding a = new ActionAdding();
		a.addingTwoNumbers(10, 20);
		a.multiplyingTwoNumber(10, 20);
	}

	/**
	 * 
	 */
	private static void testedCastingObject() {
		Calculator a = new Addition();
		((Addition)a).methodInAddition();
	}

	/**
	 * 
	 */
	private static void testingAdditionRandom() {
		Addition a = new Addition();
		a.addingNumbers(10, 5);
	}

	/**
	 * 
	 */
	private static void testingExtendingOfClasses() {
		Addition a = new Addition("what is up?");
		AdditionTwo t = new AdditionTwo("what's up?");
	}

	/**
	 * 
	 */
	private static void testingInheritance() {
		Calculator a = new Calculator(10.20);
		System.out.println(a.getNumber());
		Addition b = new Addition(20.20);
		System.out.println(b.getNumber());
		AdditionTwo c = new AdditionTwo(30.30);
		System.out.println(c.getNumber());
	}

	/**
	 * 
	 * 
	 */
	private static void testingGettersAndSetters() {
		Calculator a = new Calculator();
		System.out.println(a.getMainValue());
		a.mainValuePlusOne();
		System.out.println(a.getMainValue());
	}

	/**
	 * 
	 */
	private static void testingHowConstructorsWork() {
		Calculator a = new Calculator();
		a.mainValuePlusOne();
		Calculator b = new Calculator(15);
		b.mainValuePlusOne();
	}

	/**
	 * 
	 */
	private static void testingInstanceVariables() {
		Calculator a = new Calculator();
		a.mainValuePlusOne();
		a.mainValuePlusOne();
		a.mainValuePlusOne();
	}

	/**
	 * 
	 */
	private static void testingInstancesOfAMethod() {
		Calculator a = new Calculator();
		a.instanceOfAMethod();
	}

	/**
	 *	just testing how element passing works in Java 
	 */
	private static void testedHowElementPassingWorks() {
		Calculator a = new Calculator();
		int c;
		int b;
		c = 10;
		b = 20;
		// testing how customing a class works
		b = RandomActions.randomAddition(b);
		// testing how customing a class works
		c = RandomActions.randomMinus(c);
		System.out.println(c);
		System.out.println(b);
	}

	/**
	 * 
	 */
	private static void testingHowEncapsulationWorks() {
		OlivePress olive = new OlivePress();
		olive.setName("random name");
		olive.setSurname("random surname");
		olive.setAge(10);
		System.out.println("Name:" + olive.getName() + "\nSurname: " + olive.getSurname() + "\nAge: " + olive.getAge());
	}

	/**
	 * 
	 */
	private static void testingHowIteratorsWork() {
		Calculator a = new Calculator();
		a.testingIteratorWorking();
	}

	/**
	 * 
	 */
	private static void hashMapTesting() {
		Calculator a = new Calculator();
		a.hashMapTesting();
	}

	/**
	 * 
	 */
	private static void testingHowArrayLitsWork() {
		Calculator a = new Calculator();
		a.testingArrayList();
	}

	/**
	 * 
	 */
	private static void testingHow2DArraysWork() {
		Calculator a = new Calculator();
		a.printing2DArray();
	}

	private static void arrayTesting() {
		// this is just a way to show how to work with arrays
		// later will use this in creating a calculator
		Calculator a = new Calculator();
		a.printingAnArray();
	}

	private static void testingDebugger() {
		Calculator n = new Calculator();
		int a;
		int b;
		a = 10;
		b = 20;
		n.randomTestWithNumbers(a, b);
		System.out.println("Get some values now" + a + b);
		b = n.returningOneBigger(b);	
		System.out.println(b);

		n.debuggerExperiment();
	}

	private static void testingExceptionThrowing() {
		Calculator a = new Calculator();
		try {
			a.getArrayItem();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Array item was out of bounds!");
		}
	}

	/**
	 * 
	 */
	private static void testingErrorHandling() {
		Calculator a = new Calculator();
		a.willMakeAnError();
	}

	/**
	 * 
	 */
	private static void testingDateAndStringError() {
		Calculator a = new Calculator();
		a.gettingTheDate();
		a.makingStringNull("random");
	}

	/**
	 * 
	 */
	private static void testingStringParsing() {
		
		Calculator a = new Calculator();
		a.informationAboutString("Sveiki kaip sekais?", "sekais");
	}

	/**
	 *  
	 */
	private static void testingStringBuilderClass() {
		Calculator a = new Calculator();
		a.addingToAnother("Sveikas", " gyvas");
	}

	/**
	 * Just testing how equals operator works
	 */
	private static void testingWorkWithString() {
		Calculator a = new Calculator();
		a.checkingIfEqual("labas", "labAs");
	}

	private static void calculatorAdditionalTest() throws NumberFormatException {
		// this comit was done while being offline
		Calculator a = new Calculator();
		String s1 = getInput("Enter a numeric value: ");
		String s2 = getInput("Enter a numeric value: ");
		String op = getInput("Enter 1=Add, 2=Subtract, 3=Multiply, 4=Divide");
		
		int opInt = Integer.parseInt(op);
		double result = 0;

		switch (opInt) {
		case 1:
			result = Calculator.addingNumbers(s1, s2);
			break;
		case 2:
			result = Calculator.subtractNumbers(s1, s2);
			break;
		case 3:
			result = Calculator.multiplyNumbers(s1, s2);
			break;
		case 4:
			result = Calculator.divideNumbers(s1, s2);
			break;

		default:
			System.out.println("You entered an incorrect value");
			break;
		}

		System.out.println("The answer is " + result);
	}

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

	private static void arrayCopyByReferenceTest() {
		Calculator a = new Calculator();
		int[] random = {10, 20, 30, 40};
		System.out.println("Before change array[0] value OUTSIDE the function: " + random[0]);
		a.changeArrayValue(random);
		System.out.println("After the change array[0] value OUTSIDE the function: " + random[0]);
	}

	private static void stringCopyByReferenceTest() {
		// testing copy reference in Java
		Calculator a = new Calculator();
		String something = "Old";
		System.out.println("String outside the function: " + something);
		a.changeString(something);
		// I see here that String hasn't changed
		// This means that in Java objects are copyied by reference
		System.out.println("String outside the function: " + something);
	}

	private static void methodOverloadingTest() {
		// testing method overloading
		int value1 = 5;
		int value2 = 10;
		int value3 = 15;
		Calculator a = new Calculator();
		
		int result = a.addValues(value1, value2, value3);
		System.out.println("The result is: " + result);

		String string1 = "10";
		String string2 = "25";
		int result2 = a.addValues(string1, string2);
		System.out.println("The result with string is: " + result2);
	}

	private static void addingMultipleValues() {
		// adding multiple values as argument
		Calculator a = new Calculator();
		a.addMultipleValues(1, 2, 3, 4, 5, 5, 5);
	}

	private static void testedMethods(String[] args) {
		helloWorldTest();
		argumentsToProgramTest(args);
		workingWithMethods();
		AnotherClass anotherClass = variablesTest();
		Calculator a = numbersTest();
		operatorsTest(anotherClass, a);
		workingWithStringAndChar(anotherClass, a);
		Calculator bi = numberAdditionTest();
		conditionalTest(bi);
		switchTest(bi);
		loopsTest(bi);
		addingMultipleValues();
		methodOverloadingTest();	
		stringCopyByReferenceTest();
		arrayCopyByReferenceTest();
		calculatorAdditionalTest();
		testingWorkWithString();
		testingStringBuilderClass();
		testingStringParsing();
		testingDateAndStringError();
		testingErrorHandling();
		testingExceptionThrowing();
		testingDebugger();
		arrayTesting();
		testingHow2DArraysWork();
		testingHowArrayLitsWork();
		hashMapTesting();
		testingHowIteratorsWork();
		testingHowEncapsulationWorks();
		testedHowElementPassingWorks();
		testingInstancesOfAMethod();
		testingInstanceVariables();
		testingHowConstructorsWork();
		testingGettersAndSetters();
		testingInheritance();
		testingExtendingOfClasses();
		testingAdditionRandom();
		testedCastingObject();
		testingHowInterfaceWorks();
		testingFileManagement();
	}

	private static void loopsTest(Calculator bi) {
		bi.testingLoops();
	}

	private static void switchTest(Calculator bi) {
		bi.switchingAction(20, 10);
		bi.switchingActionUsingEnums(20, 10);
	}

	private static void conditionalTest(Calculator bi) {
		// experimenting with conditional sentences
		bi.ifNumberIsBiggerThen100(115.7);
		bi.ifStringIsTrue("true");
	}

	private static Calculator numberAdditionTest() {
		// working with two number addition (calculator)
		Calculator bi = new Calculator();
		// commenting this one because of "three time error"
		bi.addingTwoNumbers();
		return bi;
	}

	private static void workingWithStringAndChar(AnotherClass anotherClass,
			Calculator a) {
		// working with a character and making it upper case
		anotherClass.upperCasePrinter('a');

		// working with boolean parser from String 
		a.booleanParser("true");
		
		// working with string and a date output
		a.dateOutput("some text ");
		a.longPrinter(100000000000L);
	}

	private static void operatorsTest(AnotherClass anotherClass, Calculator a) {
		// testing operators
		a.addingNumbers(10, 20);
		// testing comparison operators
		anotherClass.comparingStrings("hello", "hello");
	}

	private static Calculator numbersTest() {
		// testing numbers working
		
		Calculator a = new Calculator();
		a.addition(19, 27);
		a.minus(21, 42);
		a.convertingDoubleToInt(12.22);
		a.convertingIntToDouble(10);
		a.convertingDoubleToIntWithHelperClass(10.54);
		return a;
	}

	private static AnotherClass variablesTest() {
		// testing work with variables
		AnotherClass anotherClass = new AnotherClass();
		// experimenting with variables
		anotherClass.doSomething();
		return anotherClass;
	}

	private static void workingWithMethods() {
		// here I'm creating an object
		Welcomer welcomer = new Welcomer();
		// calling a method of an object
		welcomer.sayHello();
		// calling a method with an object 
		welcomer.charExperiment();
	}

	private static void argumentsToProgramTest(String[] args) {
		// getting to know how many arguments are passes to program
		System.out.println("Number of args: " + args.length);
		
		// printing out arguments
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

	private static void helloWorldTest() {
		System.out.println("Hello world!");
	}

	
	
}


