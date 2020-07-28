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
		
		System.out.println("그 해의 경과 일수를 구합니다.");
		
		do{
			System.out.print("년: ");
			int year = sc.nextInt();
			System.out.print("월: ");
			int month = sc.nextInt();
			System.out.print("일: ");
			int day = sc.nextInt();
			
			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
			System.out.printf("%d년 %d월 %d일의 그 해 남은 일 수 : %d\n", year, month, day, leftDayOfYear(year, month, day));
			
			System.out.print("한번 더 할까요? (1.예/0.아니오) : ");
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
