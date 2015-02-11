
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		// getting to know how many arguments are passes to program
		System.out.println("Number of args: " + args.length);
		
		// printing out arguments
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			
		// here I'm creating an object
		Welcomer welcomer = new Welcomer();
		// calling a method of an object
		welcomer.sayHello();
		// calling a method with an object 
		welcomer.charExperiment();
		
		// testing work with variables
		AnotherClass anotherClass = new AnotherClass();
		// experimenting with variables
		anotherClass.doSomething();
		
		// testing numbers working
		
		Calculator a = new Calculator();
		a.addition(19, 27);
		a.minus(21, 42);
		a.convertingDoubleToInt(12.22);
		a.convertingIntToDouble(10);
		a.convertingDoubleToIntWithHelperClass(10.54);
		
		// testing committing with branch
		
		// testing operators
		a.addingNumbers(10, 20);
		// testing comparison operators
		anotherClass.comparingStrings("hello", "hello");
		
		// working with a character and making it upper case
		anotherClass.upperCasePrinter('a');

		// working with boolean parser from String 
		a.booleanParser("true");
		
		// working with string ansd a date output
		a.dateOutput("some text ");
		a.longPrinter(100000000000L);
		
		// working with two number addition (calculator)
		Calculator bi = new Calculator();
		// commenting this one because of "three time error"
//		bi.addingTwoNumbers();
		
		// experimenting with conditional sentences
		bi.ifNumberIsBiggerThen100(115.7);
		bi.ifStringIsTrue("true");

		}
	}
}


