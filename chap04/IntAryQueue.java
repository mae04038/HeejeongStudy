package chap04;

import chap04.IntStack.OverflowIntStackException;

public class IntAryQueue {

	private int max; // ť ũ��
	private int num; // ���� ������ ��
	private int[] que; // ť ��ü
	
	public IntAryQueue(int capacity) {
		num = 0;
		max = capacity;
		que = new int [max];
	}
	
	public class EmptyIntAryQueueException extends RuntimeException{
		public EmptyIntAryQueueException() {}
	}
	public class OverflowIntAryQueueException extends RuntimeException{
		public OverflowIntAryQueueException() {}
	}
	
	public int enqueue(int x) {
		if(num>max)
			throw new OverflowIntAryQueueException();
		return que[num++] = x;
	}
	public int dequeue() {
		if(num <= 0) 
			throw new EmptyIntAryQueueException();
		int x = que[0]; // ������
		for(int i=0;i<num-1;i++)
			que[i] = que[i+1];
		num--; //�����Ͱ��� ����
		return x; // ��ť�� ��
	}
	public int peek() throws EmptyIntAryQueueException{
		if(num<=0)
			throw new EmptyIntAryQueueException();
		return que[num-1];		
	}
	public int indexOf(int x) {
		for(int i=0;i<num;i++)
			if(que[i] == x) 
				return i;
		return -1;
	}
	public void clear() {
		num = 0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return num;
	}
	public boolean isEmpty() {
		return num<=0;
	}
	public boolean isFull() {
		return num>=max;
	}
	public void dump() {
		if(num<=0)
			System.out.println("ť �������");
		else {
			for(int i=0;i<num;i++)
				System.out.println("que["+i+"]�� "+que[i]);
		}
	}
}
