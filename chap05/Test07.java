package chap05;

import java.util.Scanner;

public class Test07 {

	static void move(int no, int x, int y) {
		char name[] = {'A', 'B', 'C'};
		
		if(no>1) {
			move(no-1, x, 6-x-y);
		}
		System.out.println("����["+no+"]��"+name[x-1]+"��տ��� "+name[y-1]+"������� �ű�.");
		if(no>1)
			move(no-1, 6-x-y, y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		System.out.print("���� ����:");
		int n = sc.nextInt();
		
		move(n, 1, 3);

	}

}
