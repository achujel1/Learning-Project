package calc;

public class Addition extends Calculator {
	public Addition(){
		
	}
	public Addition(double number){
		this.setNumber(number);
	}
	public Addition(String name){
		super(10.15);
		System.out.println(NAME);
	}

	@Override
	public void addingNumbers(int a, int b) {
		System.out.println("Override a method which doesn't do addition!");
		System.out.println(a - b);
//		super.addingNumbers(a, b);
	}
}
