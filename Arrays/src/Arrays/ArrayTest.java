package Arrays;


public class ArrayTest {
public static void main(String[]args){
	double[] myList = {1.9,2.9,3.4,3.5};
	//to print the array elements
	
	for (int i = 0; i<myList.length; i++){
		System.out.println(myList[i]);
	}
	//summing all the elements
	double total = 0;
	
	for(int i = 0; i < myList.length; i++){
		total = total + myList[i];
	}
	System.out.println("the total is " + total);
	//to find and print the largest element
	double max = myList[0];
	for (int i = 1; i < myList.length; i++){
		if (myList[i] > max) max = myList[i];
	}
	System.out.println("maximum value is " + max);
}
}
