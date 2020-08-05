import java.util.*;

class IntQueue{
	private int max;
	private int num;
	private int[] que;
	private int front;
	private int rear;
	
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		que = new int [max];
	}
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	public void push(int x) {
		if(num>=max)
			throw new OverflowIntStackException();
		que[rear++] = x;
		num++;
		if(rear == max)
			rear = 0;
	}
	public int pop() {
		if(num<=0)
			throw new EmptyIntStackException();
		int x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	public int size() {
		return num;
	}
	public int empty() {
		if(num<=0)
			return 1;
		else
			return 0;
	}
	public int front() {
		if(num<=0)
			return -1;
		else
			return que[front];
	}
	public int back() {
		if(num<=0)
			return -1;
		else
			return que[num-1];
	}
	
}

public class Q10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		IntQueue q = new IntQueue(12);
		
		int orderNum = sc.nextInt();
		int triedNum=0;
		int result[] = new int[orderNum];
		
		while(triedNum<orderNum) {
			for(int i=0;i<orderNum;i++) {
				String order = sc.next();
				
				switch(order) {
				case "push" : 
					int num = sc.nextInt();
					q.push(num);
					result[i] = 1000;
					triedNum++;
					break;
				case "pop":
					int x =q.pop();
					//System.out.println(x);
					result[i] = x;
					triedNum++;
					break;
				case "size":
					int siZe = q.size();
					//System.out.println(siZe);
					result[i] = siZe;
					triedNum++;
					break;
				case "front" : 
					int y = q.front();
					//System.out.println(y);
					result[i] = y;
					triedNum++;
					break;
				case "back" :
					int z = q.back();
					result[i] = z;//0
					triedNum++;
					break;
				case "empty":
					int result_1 = q.empty();
					//System.out.println(result);
					result[i] = result_1;
					triedNum++;
					break;
					
				}
			}
		}
		for(int i=0;i<orderNum;i++) {
			if(result[i] == 1000)
				continue;
			System.out.println(result[i]);
		}

	}

}
