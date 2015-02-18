
public class Main {
	public static void main(String[] args) {
//		testedMethods(args);
	
		stringCopyByReferenceTest();
		arrayCopyByReferenceTest();
		
		System.out.println("Calculator");
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


