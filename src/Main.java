
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
		}
	}
}


