package n1exercici8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("Marta", 1000);
		lhm.put("Paula", 2000);
		lhm.put("Juan", 1500);
		System.out.println(lhm);

//		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(lhm);
//		System.out.println(tm);
//		
//		lhm.clear();
//		lhm.putAll(tm);
//		System.out.println(lhm);
		
		ArrayList<Map.Entry<String, Integer>> al = new ArrayList<Map.Entry<String, Integer>>(lhm.entrySet());

		al.sort(new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> entrada1, Map.Entry<String, Integer> entrada2) {
				return entrada1.getKey().compareTo(entrada2.getKey());
			}
		});
		
		lhm.clear();
		 for (Map.Entry<String, Integer> l : al) {
	            lhm.put(l.getKey(), l.getValue());
		 }
		 System.out.println(lhm);

	}

}
