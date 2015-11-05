import java.util.*;
public class Palindrome {
	public static void main (String[]args){
		System.out.println("Enter your word...");
		Scanner entry = new Scanner(System.in);
		String forward = entry.next();
		String backward=new StringBuffer(forward).reverse().toString();
		//System.out.println(forward + "  " + backward);
		if (forward.equals(backward)){
			System.out.println(forward + " is palindromic.");
		}else{
			System.out.println(forward + " is not palindromic.");
		}
		entry.close();
	}

}