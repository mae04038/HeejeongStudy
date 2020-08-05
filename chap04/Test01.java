package chap04;
import java.util.*;


public class Test01 {		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("���� ������ ��: "+s.size()+" / "+s.capacity());
			System.out.print("(1)Ǫ�� (2)�� (3)��ũ (4)���� (5)�˻� (6)��� (7)���� (0)���� : " );
			
			int choice = sc.nextInt();
			if(choice == 0) break;
			
			int x;
			switch(choice) {
			case 1:
				System.out.print("������: ");
				x=sc.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
				
			case 2:
				try {
					x= s.pop();
					System.out.println("���� ������: "+x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ �������");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� ������: "+x);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				System.out.print("�˻��� �� �Է�:");
				int idx = sc.nextInt();
				x = s.indexOf(idx);
				System.out.println("�˻��� ���� ��ġ"+x);
				break;
			case 6:
				s.clear();
				break;
			case 7:
				System.out.println("�뷮��" + s.capacity());
				System.out.println("������ ����" + s.size());
				System.out.println("��� " + (s.isEmpty() ? "�ֽ��ϴ�." : "���� �ʽ��ϴ�."));
				System.out.println("���� " + (s.isFull() ? "á���ϴ�." : "���� �ʾҽ��ϴ�."));
				break;
			}
		}

	}

}
