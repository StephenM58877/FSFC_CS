package Arrays;

public class Linked_List {
	private Link first;
	
	public void Linked_List(){
		first = null;
	}
	
	public boolean isEmpty(){
		return (first==null);
	}
	
public void insertFirst(String Name,int age, String favBand, boolean inARelationship){
	Link link = new Link(Name, age, favBand, inARelationship);
	
	if(first!=null){
		link.setNextLink(first);;
		first = link;
	}
	else{
		first=link;
	}
}


}
