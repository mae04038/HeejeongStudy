package chap04;
import java.util.*;


public class Test01 {		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수: "+s.size()+" / "+s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)검색 (6)비움 (7)정보 (0)종료 : " );
			
			int choice = sc.nextInt();
			if(choice == 0) break;
			
			int x;
			switch(choice) {
			case 1:
				System.out.print("데이터: ");
				x=sc.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
				
			case 2:
				try {
					x= s.pop();
					System.out.println("팝한 데이터: "+x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있음");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터: "+x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				System.out.print("검색할 값 입력:");
				int idx = sc.nextInt();
				x = s.indexOf(idx);
				System.out.println("검색한 값의 위치"+x);
				break;
			case 6:
				s.clear();
				break;
			case 7:
				System.out.println("용량：" + s.capacity());
				System.out.println("데이터 수：" + s.size());
				System.out.println("비어 " + (s.isEmpty() ? "있습니다." : "있지 않습니다."));
				System.out.println("가득 " + (s.isFull() ? "찼습니다." : "차지 않았습니다."));
				break;
			}
		}

	}

}
