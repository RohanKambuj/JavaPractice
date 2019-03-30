package calculatorAssign;

public class Calculator implements ICalculator{

    int a,b;
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int subtraction(int a, int b) {
		return b-a;
	}
	
	public int multiplication(int a, int b) {
		return a*b;
	}
	
	public int division(int a, int b) {
		return b/a;
	}
}
