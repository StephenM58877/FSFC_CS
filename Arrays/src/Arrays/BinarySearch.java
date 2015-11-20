package Arrays;

public class BinarySearch {
	static int[] a={1,2,12,22,33,100};
	static int x = 22;
	
	public static void main(String[] args) {
		String result = binarySearch(a,x)?"Value found" :"Value not found";
		System.out.println(result);
	}
	public static boolean binarySearch(int[] array, int searchVal){
		int start=0;
		int end = array.length -1;
		
		for (int i=0; i < array.length; i++){
			int middle=(end+start)/2;
			if(array[middle] == searchVal){
				return true;
			}
			else if(array[middle]>searchVal){
				end=middle-1;
			}
			else{
				start=middle+1;
			}
		}
		return false;
	}
	
}
