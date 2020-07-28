package chap02;
import java.util.*;

public class Test06 {

	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		int i=0, j=0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r);
			x/=r;
			
			System.out.print(r+"|");
			System.out.printf("%06d", x);
			if(i!=0)
			{
				System.out.println("..."+d[j]);
			}
			else
				System.out.println();
			System.out.println(" +-------");
			
			i++;
			j++;
		}while (x!=0);
		return digits;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ����: ");
				no = sc.nextInt();
			}while(no<0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36) : ");
				cd = sc.nextInt();
			}while(cd<2 || cd>36);
			
			dno = cardConvR(no, cd, cno);
			//
			
			
			
			System.out.println();
			
			
			System.out.print(cd+"�����δ� ");
			for(int i=dno-1;i>=0;i--)
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
			
			System.out.print("�ѹ� �� �ұ��? (1.��/0.�ƴϿ�) : ");
			retry = sc.nextInt();
		}while(retry == 1);

	}

}
