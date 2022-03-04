package n1exercici4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		ArrayList<Objecte> arrayL = new ArrayList<Objecte>();
		arrayL.add(new Objecte("obj1al"));
		arrayL.add(new Objecte("obj2al"));
		mIterador(arrayL);
		
		LinkedList<Objecte> linkedL = new LinkedList<Objecte>();
		linkedL.add(new Objecte("obj1ll"));
		linkedL.add(new Objecte("obj2ll"));
		mIterador(linkedL);
		
		HashSet<Objecte> hashS = new HashSet<Objecte>();
		hashS.add(new Objecte("obj1hs"));
		hashS.add(new Objecte("obj2hs"));
		mIterador(hashS);
		
		LinkedHashSet<Objecte> linkedHS = new LinkedHashSet<Objecte>();
		linkedHS.add(new Objecte("obj1lhs"));
		linkedHS.add(new Objecte("obj2lhs"));
		mIterador(linkedHS);
		
		TreeSet<Objecte> treeS = new TreeSet<Objecte>();
		treeS.add(new Objecte("obj1ts"));
		treeS.add(new Objecte("obj2ts"));
		mIterador(treeS);
	}
	
	public static void mIterador(Collection<Objecte> c) {
		Iterator<Objecte> it = c.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		System.out.println();
	}

}
