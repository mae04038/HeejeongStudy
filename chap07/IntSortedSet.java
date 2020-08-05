package chap07;

public class IntSortedSet {

	private int max;
	private int num;
	private int[] set;
	
	public IntSortedSet(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max]; 
		} catch (OutOfMemoryError e) { 
			max = 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
