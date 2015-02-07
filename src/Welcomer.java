// here I'm creating a class
public class Welcomer {
	private String welcome = "Hello";
	// method to call string
	public void sayHello() {
		System.out.println(welcome);
	}
	// method to call some chars
	public void charExperiment() {
		char[] chars = {'C', 'h', 'a', 'r', 's'};
		String s = new String(chars);
		System.out.println(s);
	}
}