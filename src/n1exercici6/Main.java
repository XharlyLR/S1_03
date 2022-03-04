package n1exercici6;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> nums = new LinkedList<Integer>();
		ListIterator<Integer> it = nums.listIterator();

		it.add(1);
		it.add(2);
//		it.previous();
//		it.add(3);
//		it.previous();
//		it.add(4);
//		it.previous();
//		it.add(5);
//		it.previous();
//		it.add(6);
		System.out.println(nums);
		while (it.nextIndex() != nums.size() / 2) {
			it.previous();
		}
		it.add(7);
		System.out.println(nums);
		while (it.nextIndex() != nums.size() / 2) {
			it.previous();
		}
		it.add(8);
		System.out.println(nums);
		while (it.nextIndex() != nums.size() / 2) {
			it.previous();
		}
		it.add(9);
		System.out.println(nums);
	}

}
