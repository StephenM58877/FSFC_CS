package Arrays;
import java.util.*;
public class TwoDArrays {
public static void main(String[]args){
	System.out.println("How many rows?");
	Scanner row=new Scanner(System.in);
	System.out.println("How many columns?");
	Scanner column=new Scanner(System.in);
	int numRow=0;
	numRow=row.nextInt();
	int numColumn=0;
	numColumn=column.nextInt();
	int[][]a=new int[numRow][numColumn];
	Scanner sc=new Scanner(System.in);
	for(int rows = 0; rows<numRow;rows++){
		for(int columns=0;columns<numColumn;columns++){
			System.out.println("Enter a number");
			a[rows][columns]=sc.nextInt();
		}
	}
	sc.close();
	row.close();
	column.close();
	int largest = 0;
	for(int rows = 0; rows<numRow;rows++){
		for(int columns=0;columns<numColumn;columns++){
			if (a[rows][columns]>largest){
				largest=a[rows][columns];
			}
		}
}
System.out.println("The Biggest number is "+ largest);
}
}