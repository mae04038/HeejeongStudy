package chap04;

public class IntDequeue {

	private int max;
	private int num;
	private int front;
	private int rear;
	private int[] que;
	
	public IntDequeue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		que = new int[max];
	}
	
	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {
		}
	}
	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {
		}
	}
	
	public int enqueueFront(int x) {
		if(num>=max)
			throw new OverflowIntDequeException();
		num++;
		if(--front < 0)
			front = max-1;
		que[front] = x;
		return x;
	}
	public int enqueueRear(int x) {
		if(num>=max)
			throw new OverflowIntDequeException();
		que[rear++] = x;
		num++;
		if(rear==max)
			rear = 0;
		return x;
	}
	public int dequeueFront() {
		if(num == 0)
			throw new EmptyIntDequeException();
		int x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	public int dequeueRear() {
		if(num == 0)
			throw new EmptyIntDequeException();
		num--;
		if(--rear <0)
			rear = max-1;
		int x = que[rear];
		return x;
	}
	
}
