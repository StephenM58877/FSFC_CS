
public class Calculator {
	private float numOne;
	private float numTwo;

	public Calculator(){
	}
	public float getNumOne(){
		return this.numOne;
	}
	public void setNumOne(float nOne){
		this.numOne=nOne;
	}
	public void setNumTwo(float nTwo){
		this.numTwo=nTwo;
	}
	public float subtractNumbers(){
		return numOne - numTwo;
	}
	public float divideNumbers(){
		return numOne / numTwo;
	}
	public float multiplyNumbers(){
		return numOne * numTwo;
	}
	public float addNumbers(){
		return numOne + numTwo;
	}
	}