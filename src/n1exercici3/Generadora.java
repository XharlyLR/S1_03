package n1exercici3;

import java.util.ArrayList;

public class Generadora {

	static int j = -1;
	
	public static String seguentPersonatge() {
		
		ArrayList<String> nPersonatges = new ArrayList<String>();
		nPersonatges.add("Aragorn");
		nPersonatges.add("Legolas");
		nPersonatges.add("Gimli");
		nPersonatges.add("Gandalf");
		nPersonatges.add("Frodo");

		if(j >= nPersonatges.size()-1) {
			j = 0;
		}
		else {
			j++;
		}
		
		return nPersonatges.get(j);
	}
}
