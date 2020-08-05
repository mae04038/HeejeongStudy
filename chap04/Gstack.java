package chap04;

import chap04.IntStack.EmptyIntStackException;
import chap04.IntStack.OverflowIntStackException;

public class Gstack<E> {

	private int max;
	private int ptr;
	private E[] stk;
	
	public Gstack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public static class EmptyGstackException extends RuntimeException{
		public EmptyGstackException() {}
	}
	public static class OverflowGstackException extends RuntimeException{
		public OverflowGstackException() {}
	}
	
	public E push(E x) throws OverflowIntStackException{
		if(ptr>=max)
			throw new OverflowGstackException();
		return stk[ptr++] = x;
	}
	public E pop() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyGstackException();
		return stk[--ptr];
	}
	public E peek() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyGstackException();
		return stk[ptr-1];
	}
	public int indexOf(E x) {
		for(int i=ptr-1;i>=0;i--)
			if(stk[i]==x)
				return i;
		return -1;
	}
	public void clear() {
		ptr=0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return ptr;
	}
	public boolean isEmpty() {
		return ptr<=0;
	}
	public boolean isFull() {
		return ptr>= max;
	}
	public void dump() {
		if(ptr<=0)
			System.out.println("������ ��� �ֽ��ϴ�.");
		else {
			for(int i=0;i<ptr;i++)
				System.out.print(stk[i]+" ");
			System.out.println();
		}
	}
}