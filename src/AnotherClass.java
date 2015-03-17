// class for variables experiment
public class AnotherClass {
	String sayHello = new String("Hello!");
	void doSomething(){
		System.out.println(sayHello);
	}
	// method which is comparing two strings
	public void comparingStrings(String a, String b){
		if (a.equals(b)) {
			System.out.println(a + " is equal to " + b);
		}
	}
	// method that prints upper case letter
	public void upperCasePrinter(char a) {
		System.out.println("Char " + a + " will be uppercase: " + Character.toUpperCase(a));
	}

	public void randomMethod(char b){
		System.out.println("random");
	}
}
