package Arrays;
public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int maxSize){
		this.maxSize=maxSize;
		this.top=-1;
		stackArray=new long[maxSize];
	}
	
	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public void push(long j){
		String result = top==stackArray.length-1?" Stack is full":pushItem(j);
		msgBox(result);
	}
	
	public String pushItem(long j){
		stackArray[++top]=j;
		return "Item added to stack";
	}
	
	public void pop(){
		msgBox(top==-1?"Stack is empty":popItem());
	}
	
	public String popItem(){
		return "Item at the top : " + stackArray[top--]+ " removed";
	}
	
	public void msgBox(String message){
		System.out.println("** " + message + " **");
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	public boolean isFull(){
		return (top==stackArray.length-1);
	}
	
	public long[] getArray(){
		return stackArray;
	}
}
