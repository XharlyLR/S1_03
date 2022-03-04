package n1exercici7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("Juan", 1000);
		hm.put("Marta", 2000);
		hm.put("Paula", 1500);
		System.out.println(hm);
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(hm);
		System.out.println(tm);
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>(tm);
		System.out.println(lhm);
		
		HashSet<String> hs = new HashSet<String>();
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		for(Map.Entry<String, Integer> entrada : lhm.entrySet()) {
			hs.add(entrada.getKey());
			lhs.add(entrada.getKey());
		}
		System.out.println(hs);
		System.out.println(lhs);
	}

}
