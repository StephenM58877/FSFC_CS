
public class Switch {
	public static void main(String args[]){
		char grade = 'A';
		switch(grade)
		{
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
		case 'C':
			System.out.println("Well done");
			break;
		case 'D':
			System.out.println("You Passed");
		case 'F':
			System.out.println("Better Try again");
			break;
			default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your grade is " + grade);
}
	}
