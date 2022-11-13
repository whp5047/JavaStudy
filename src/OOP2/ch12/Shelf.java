package OOP2.ch12;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
		
	}

	public ArrayList<String> getShlef(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
	
}
