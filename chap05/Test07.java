package chap05;

import java.util.Scanner;

public class Test07 {

	static void move(int no, int x, int y) {
		char name[] = {'A', 'B', 'C'};
		
		if(no>1) {
			move(no-1, x, 6-x-y);
		}
		System.out.println("원반["+no+"]을"+name[x-1]+"기둥에서 "+name[y-1]+"기둥으로 옮김.");
		if(no>1)
			move(no-1, 6-x-y, y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반 개수:");
		int n = sc.nextInt();
		
		move(n, 1, 3);

	}

}
