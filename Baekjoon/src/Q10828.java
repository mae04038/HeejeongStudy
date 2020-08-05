import java.util.*;
class IntStack{
	private int num; // 저장된 데이터 개수
	private int[] stk; // 본체
	private int max; // 스택 용량
	
	public IntStack(int capacity) {
		num = 0;
		max = capacity;
		stk = new int [max];
	}
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	public int push(int x) throws OverflowIntStackException {
		if(num>=max)
			throw new OverflowIntStackException();
		return stk[num++] = x;
	}
	public int pop() throws EmptyIntStackException{
		if(num == 0)
			return -1;
		int x = stk[--num];
		return x;
	}
	public int size() {
		return num;
	}
	public int empty() {
		if(num == 0)
			return 1;
		else
			return 0;
	}
	public int top() {
		if(num == 0)
			return -1;
		return stk[num-1];
	}
	
}
public class Q10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		IntStack s = new IntStack(10);
		
		int orderNum = sc.nextInt();
		int triedNum = 0;
		int[] result = new int[orderNum];
		
		while(triedNum < orderNum) {
			for(int i=0;i<orderNum;i++) {
				String order = sc.next();
				
				switch(order) {
				case "push" : 
					int num = sc.nextInt();
					s.push(num);
					result[i] = 0;
					triedNum++;
					break;
				case "pop":
					int x =s.pop();
					//System.out.println(x);
					result[i] = x;
					triedNum++;
					break;
				case "size":
					int siZe = s.size();
					//System.out.println(siZe);
					result[i] = siZe;
					triedNum++;
					break;
				case "top" : 
					int y = s.top();
					//System.out.println(y);
					result[i] = y;
					triedNum++;
					break;
				case "empty":
					int result_1 = s.empty();
					//System.out.println(result);
					result[i] = result_1;
					triedNum++;
					break;
					
				}
			}
		}
		
		for(int i=0;i<orderNum;i++) {
			if(result[i] == 0)
				continue;
			System.out.println(result[i]);
		}

	}

}
