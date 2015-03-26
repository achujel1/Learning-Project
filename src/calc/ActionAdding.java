package calc;

public class ActionAdding implements ActionInterface {

	@Override
	public void addingTwoNumbers(int numberOne, int numberTwo) {
		System.out.println(numberOne + numberTwo);
	}

	@Override
	public void multiplyingTwoNumber(int numberOne, int numberTwo) {
		System.out.println(numberOne * numberTwo);
	}

}
