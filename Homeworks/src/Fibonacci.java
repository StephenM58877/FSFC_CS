import java.util.*;
public class Fibonacci {
public static void main (String[]args){
	int count = 2;
	int current = 1;
	int previous = 0;
	int total = 0;
	String output = "0";
	System.out.println("How many terms?");
	Scanner input = new Scanner(System.in);
	int length= Integer.parseInt(input.nextLine());
	if (length==1){
		System.out.println(output);
	}
	output = output+", 1";
	while (count<length){
		total = previous + current;
		output = output + ", " + total;
		previous = current;
		current = total;
		count++;	
	}
	System.out.println(output);
	input.close();
}
}
