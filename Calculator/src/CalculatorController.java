
public class CalculatorController {

	public static void main(String[]args) {
		float nOne, nTwo;
		Calculator Calc = new Calculator();
		
		nOne = Float.parseFloat(args[0]);
		nTwo = Float.parseFloat(args[1]);
		
		Calc.setNumOne(nOne);
		Calc.setNumTwo(nTwo);
		
		System.out.println("add " + Calc.addNumbers());
		System.out.println("divide " + Calc.divideNumbers());
		System.out.println("multiply " + Calc.multiplyNumbers());
		System.out.println("subtract " + Calc.subtractNumbers());
	}
}