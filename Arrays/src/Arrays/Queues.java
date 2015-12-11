package Arrays;

public class Queues {
	private int maxSize;
	private long[]queueArray;
	private int front;
	private int rear;
	private int nItems;
	
	public void Queue(int s){
		maxSize=s;
		queueArray=new long[maxSize];
		front=0;
		rear=-1;
		nItems=0;
	}
	
	public void insert(long j){
		String result=rear==maxSize-1?"Queue full":addItem(j);
		System.out.println(result);
	}
	
	public String addItem(long j){
		queueArray[++rear]=j;
		nItems++;
		return "Item Added";
	}
	
	public void remove(){
		String result=rear==-1?"Empty Queue":removeItem();
		System.out.println(result);
	}
	
	public String removeItem(){
		long removedItem=queueArray[front++];
		nItems--;
		//shifting all values up in the queue
		for(int i=1;i<queueArray.length;i++)
		queueArray[i-1]=queueArray[i];
		return "The item " + removedItem + " from the queue";
	}
}
