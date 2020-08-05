package chap04;
import java.util.*;

class IntQueue{
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	public int enqueue(int x) throws OverflowIntQueueException{
		if(num>=max)
			throw new OverflowIntQueueException();
		que[rear++] = x;
		num++;
		if(rear == max)
			rear = 0;
		return x;
	}
	public int dequeue() throws EmptyIntQueueException{
		if(num<=0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	public int peek() throws EmptyIntQueueException{
		if(num<=0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	public int indexOf(int x) {
		for(int i=0;i<num;i++) {
			int index = (i+front) % max;
			if(que[index] == x)
				return index;
		}
		/*
		for(int i=0;i<num;i++)
			if(que[i] == x)
				return i;
				*/
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
			System.out.println("Å¥ ºñ¾îÀÕÀ½");
		else {
			for(int i=0;i<num;i++)
				System.out.println(que[(i+front)%max]);
		}
	}
	public int search(int x) {
		int idx = indexOf(x);
		if(idx == -1)
			return 0;
		int order = Math.abs(front-idx);
		return order;
	}
}

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
