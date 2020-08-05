package chap04;

import chap04.IntStack.OverflowIntStackException;

public class IntAryQueue {

	private int max; // 큐 크기
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체
	
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
		int x = que[0]; // 꺼내기
		for(int i=0;i<num-1;i++)
			que[i] = que[i+1];
		num--; //데이터개수 수정
		return x; // 디큐한 값
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
			System.out.println("큐 비어잇음");
		else {
			for(int i=0;i<num;i++)
				System.out.println("que["+i+"]는 "+que[i]);
		}
	}
}
