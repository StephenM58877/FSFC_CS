
public class ConditionalOperator {
public static void main(String [] args){
	
	int numPets =4;
	String petStatus = (numPets<4) ? "Within Limit": "Exceeded Limit";
	
	System.out.println("The pet status is: " + petStatus);
}
}
