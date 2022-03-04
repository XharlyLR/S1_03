package n1exercici4;

public class Objecte implements Comparable<Objecte>{

	private String n;
	
	public Objecte(String n) {
		super();
		this.n = n;
	}

	@Override
	public int compareTo(Objecte o) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String toString() {
		return n;
	}
	
	
	
}
