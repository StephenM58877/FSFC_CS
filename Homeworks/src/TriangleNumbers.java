import java.util.*;
public class TriangleNumbers {
	public static void main (String[]args){
		int total = 1;
		int count = 1;
		int row = 1;
		String output;
		System.out.println("How many rows would you like to be shown?");
		Scanner input = new Scanner(System.in);
		int length= Integer.parseInt(input.nextLine());
		while (row<=length){
			output = "";
			count = 1;
			while (count<=row){
				output = output + total + " ";
				count++;
				total++;
			}
			System.out.println(output);
			row++;
		}
		input.close();
}
}