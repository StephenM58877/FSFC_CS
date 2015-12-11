import java.util.Calendar;
import java.util.Set;


public class MeetingImpl implements meeting{
	private int ID;
	private Calendar Date;
	private Set<Contact> Contacts;

public MeetingImpl(int id, Calendar date, Set<Contact> contact){
	this.ID=id;
	this.Date=date;
	this.Contacts=contact;
}

public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

public Calendar getDate() {
	return Date;
}

public void setDate(Calendar date) {
	Date = date;
}

public Set<Contact> getContacts() {
	return Contacts;
}

public void setContacts(Set<Contact> contacts) {
	Contacts = contacts;
}

}

