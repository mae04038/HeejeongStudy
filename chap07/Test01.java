package chap07;

class IntSet{
	private int max;
	private int num;
	private int[] set;
	
	public IntSet(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max];
		}
		catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return num;
	}
	public int indexOf(int n) {
		for (int i = 0; i < num; i++)
			if (set[i] == n)
				return i; 
		return -1; 
	}
	public boolean contains(int n) {
		return (indexOf(n) != -1) ? true : false;
	}
	public boolean add(int n) {
		if (num >= max || contains(n) == true) 
			return false;
		else {
			set[num++] = n; 
			return true;
		}
	}
	public boolean remove(int n) {
		int idx; 

		if (num <= 0 || (idx = indexOf(n)) == -1) 
			return false;
		else {
			set[idx] = set[--num]; 
			return true;
		}
	}
	public void copyTo(IntSet s) {
		
	}
	public void copyFrom(IntSet s) {
		
	}
	
	
	
	public boolean isEmpty() {
		return num<=0;
	}
	public boolean isFull() {
		return num==max;
	}
	public void clear() {
		num = 0;
	}
	
	public boolean addSet(IntSet s) {
		boolean flag = false;
		
		for(int i=0;i<num;i++) {
			if(add(s.set[i]) == true)
				flag = true;
				//추가
		}
		return flag;
	}
	public boolean removeSet(IntSet s) {
		boolean flag = false;
		
		for(int i=0;i<num;i++) {
			if(s.contains(set[i]) == false) {
				remove(set[i]);
				flag = true;
			}
		}
		return flag;
	} 
	public boolean removeCommonSet(IntSet s) {
		boolean flag = false;
		
		for(int i=0;i<num;i++) {
			if(s.contains(set[i]) == true) {
				remove(set[i]);
				flag = true;
			}
		}
		return flag;
	}
	
	public boolean isSubsetOf(IntSet s) {
		//부분집합
		boolean flag = false;
		int numTrue=0;
		
		for(int i=0;i<num;i++) {
			if(s.contains(set[i]) == true)
				numTrue += 1;
		}
		if(numTrue == num)
			flag = true;
		return flag;
		
	}
	public boolean isProperSubsetOf(IntSet s) {
		//진부분집합 - 완전 똑같은 건 안됨
		boolean flag = false;
		
		if(s.num >= num)
			return flag;
		return s.isSubsetOf(s);
	}
	
	public void intersectionOf(IntSet s1, IntSet s2) {
		clear();
		for(int i=0;i<s1.num;i++)
			if(s2.contains(s1.set[i]))
				add(s1.set[i]); // IntSet클래스에 복사
	}
	public void differenceOf(IntSet s1, IntSet s2) {
		clear();
		for(int i=0;i<s1.num;i++)
			if(s2.contains(s1.set[i]))
				remove(s1.set[i]);
	}
	
}
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
