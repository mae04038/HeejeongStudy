package chap02;
import java.util.*;

public class Test08 {
	
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31}
	};
	
	static int isLeap(int year) {
		return (year%4 == 0 && year%100 != 0 || year%400 == 0) ? 1 : 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("�� ���� ��� �ϼ��� ���մϴ�.");
		
		do{
			System.out.print("��: ");
			int year = sc.nextInt();
			System.out.print("��: ");
			int month = sc.nextInt();
			System.out.print("��: ");
			int day = sc.nextInt();
			
			System.out.printf("�� �� %d��°�Դϴ�.\n", dayOfYear(year, month, day));
			System.out.printf("%d�� %d�� %d���� �� �� ���� �� �� : %d\n", year, month, day, leftDayOfYear(year, month, day));
			
			System.out.print("�ѹ� �� �ұ��? (1.��/0.�ƴϿ�) : ");
			retry = sc.nextInt();
		}while (retry == 1);
		
		

	}

	private static int dayOfYear(int year, int month, int day) {
		// TODO Auto-generated method stub
		while(--month != 0) {
			day += mdays[isLeap(year)][month-1];
		}
		
		return day;
	}
	static int leftDayOfYear(int y, int m, int d) {
		int days = d;
		
		if(isLeap(y) == 1)
			days = 366-dayOfYear(y, m, d);
		else
			days = 365 - dayOfYear(y,m,d);
		
		return days;
	}

}
