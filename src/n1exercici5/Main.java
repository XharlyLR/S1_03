package n1exercici5;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> numsI = new LinkedList<Integer>();
		numsI.add(1);
		numsI.add(3);
		numsI.add(5);
		
		LinkedList<Integer> numsP = new LinkedList<Integer>();
		numsP.add(2);
		numsP.add(4);
		numsP.add(6);
		
		ListIterator<Integer> itI = numsI.listIterator();
		ListIterator<Integer> itP = numsP.listIterator();
		
		while(itI.hasNext()) {
			itI.next();
		}
		while(itP.hasNext()) {
			itP.next();
		}
		while(itI.hasPrevious()) {
			itP.add(itI.previous());
		}
		System.out.println(numsI);
		System.out.println(numsP);
	}

}
