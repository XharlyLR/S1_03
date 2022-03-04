package n1exercici3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> nomPersonatgesAL = new ArrayList<String>();
		LinkedList<String> nomPersonatgesLL = new LinkedList<String>();
		HashSet<String> nomPersonatgesHS = new HashSet<String>();
		LinkedHashSet<String> nomPersonatgesLHS = new LinkedHashSet<String>();
		TreeSet<String> nomPersonatgesTS = new TreeSet<String>();
		
		String nom = Generadora.seguentPersonatge();
		do {
			nomPersonatgesAL.add(nom);
			nom = Generadora.seguentPersonatge();
		} while (!nomPersonatgesAL.contains(nom));
		
		do {
			nomPersonatgesLL.add(nom);
			nom = Generadora.seguentPersonatge();
		} while (!nomPersonatgesLL.contains(nom));
		
		do {
			nomPersonatgesHS.add(nom);
			nom = Generadora.seguentPersonatge();
		} while (!nomPersonatgesHS.contains(nom));
		
		do {
			nomPersonatgesLHS.add(nom);
			nom = Generadora.seguentPersonatge();
		} while (!nomPersonatgesLHS.contains(nom));
		
		do {
			nomPersonatgesTS.add(nom);
			nom = Generadora.seguentPersonatge();
		} while (!nomPersonatgesTS.contains(nom));

		
		System.out.println(nomPersonatgesAL);
		System.out.println(nomPersonatgesLL);
		System.out.println(nomPersonatgesHS);
		System.out.println(nomPersonatgesLHS);
		System.out.println(nomPersonatgesTS);

	}

}
