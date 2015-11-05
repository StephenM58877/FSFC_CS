import java.util.*;
public class BinaryCheck {
	String number = "";
	public static boolean isBinary (String num) {
		
		char[] numberarr = num.toCharArray();
		for (int i = 0; i <numberarr.length; i++) {
			if (numberarr[i] == '0' || numberarr[i] == '1') {
				if (i == numberarr.length) {
					return true;
				}
				continue;
			} else {
				return false;
			}
		}
		return true;
		
		
	}
	
	public static void main(String[]args){
		System.out.println("enter your number...");
		Scanner input = new Scanner(System.in);
		String number = input.next();
		isBinary(number);
		System.out.println(isBinary(number));
		input.close();
	}
}
