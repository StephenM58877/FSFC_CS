package Arrays;
import java.util.ArrayList;
public class ArrayListExample {
	public static void main(String args[]){
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("Georgia");
		obj.add("Harry");
		obj.add("Becky");
		obj.add("Liberty");
		obj.add("Lucas");
		obj.add("Jason");
		
		System.out.println("Currently the array list has the following elements:"+obj);
		
		obj.add(0,"Luke");
		obj.add(1,"James");
		obj.add(2,"Kevin");
		obj.add(3,"J-Lo");
		obj.add(4,"Arun");
		
		obj.remove("Becky");
		obj.remove("Harry");
		
		System.out.println("Current array list is:"+obj);
		System.out.println(obj.size());
		System.out.println(obj.contains("James"));
		obj.remove(1);
		System.out.println("Current array list is:"+obj);
		System.out.println(obj.size());
		System.out.println(obj.contains("James"));
		System.out.println(obj.subList(4,7));
		obj.trimToSize();
	}
}
