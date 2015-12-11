package Arrays;
import java.util.Scanner;
public class StackController {
	public static void main(String[]args){
		int stackSize=0;
		System.out.print("Enter a stack size ");
		Scanner sc=new Scanner(System.in);
		stackSize=sc.nextInt();
		Stack linearStack = new Stack(stackSize);
		
		for(int i=0; i<stackSize;i++){
			linearStack.push((long)(Math.random()*stackSize));
		}
		
		long[] x = linearStack.getArray();
		for(int i=0; i<stackSize;i++){
			System.out.print(x[i] + " ");
		}
		
		System.out.println();
		linearStack.pop();
		
		for(int i=0; i<=linearStack.getTop();i++){
			System.out.print(x[i] + " ");
		}
		sc.close();
	}
}
