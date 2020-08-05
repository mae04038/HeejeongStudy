package chap04;
import java.util.*;

class DoubleIntStack{
	private int max;
	private int ptrA;
	private int ptrB;
	private int[] stk;
	
	public enum Name{
		StackA, StackB
	};
	
	public class EmptyDoubleIntStackException extends RuntimeException{
		public EmptyDoubleIntStackException() {
		}
	}
	public class OverflowDoubleIntStackException extends RuntimeException{
		public OverflowDoubleIntStackException() {
		}
	}
	public DoubleIntStack(int capacity) {
		ptrA = 0;
		ptrB = capacity-1;
		max = capacity;
		try {
			stk = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	public int push(Name name, int x) throws OverflowDoubleIntStackException {
		if(ptrA >= ptrB+1)
			throw new OverflowDoubleIntStackException();
		switch(name) {
		case StackA:
			stk[ptrA++] = x;
			break;
		case StackB:
			stk[ptrB--] = x;
			break;
		}
		return x;
	}
	public int pop(Name name) throws EmptyDoubleIntStackException{
		int x = 0;
		switch(name) {
		case StackA:
			if(ptrA<=0)
				throw new EmptyDoubleIntStackException();
			x = stk[--ptrA];
			break;
		case StackB:
			if(ptrB>=max-1)
				throw new EmptyDoubleIntStackException();
			x = stk[++ptrB];
			break;
		}
		return x;
	}
}

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

}
