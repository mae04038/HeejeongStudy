package chap02;
import java.util.*;

public class Test11 {
	
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31}, // 평년 0
			{31,29,31,30,31,30,31,31,30,31,30,31} // 윤년 1
	};
	
	static int isLeap(int year) {
		return (year%4 == 0 && year%100 != 0 || year%400 == 0) ? 1 : 0;
	}
	
	static class YMD {
		int year;
		int month;
		int day;
		
		YMD(int y, int m, int d){
			this.year = y;
			this.month = m;
			this.day = d;
		}
		YMD after(int n) {
			YMD tmp = new YMD(this.year, this.month, this.day);
			tmp.day += n;
			
			while(tmp.day>mdays[isLeap(tmp.year)][tmp.month-1]) { // n을 더한 결과가 해당 달 일수보다 큰 경우 반복
				tmp.day -= mdays[isLeap(tmp.year)][tmp.month-1]; // n을 더한 결과에서 해당 달 일수를 빼준다. 
				if(++tmp.month > 12) {//12월 인 경우
					tmp.year++;
					tmp.month = 1;
				}
				System.out.println(tmp.day+" "+tmp.month);
			}
			
			return tmp;
		}
		YMD before(int n) {
			YMD tmp = new YMD(this.year, this.month, this.day);
			
			tmp.day -= n; // 
			
			while(tmp.day <0) { // 양수일 경우 일 수만 계산하면 되니까
				if(--tmp.month < 0) {
					tmp.year--;
					tmp.month = 12;
				}
				tmp.day += mdays[isLeap(tmp.year)][tmp.month-1];
			}
			
			
			return tmp;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("년: ");
		int year = sc.nextInt();
		System.out.print("월: ");
		int month = sc.nextInt();
		System.out.print("일: ");
		int day = sc.nextInt();
		
		YMD date = new YMD(year, month, day);
		
		System.out.print(" 몇 일 뒤/앞의 날짜를 구할까?");
		int n = sc.nextInt();
		
		YMD afterdate = date.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일 입니다.", n, afterdate.year, afterdate.month, afterdate.day);
		
		YMD beforedate = date.before(n);
		System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일 입니다.", n, beforedate.year, beforedate.month, beforedate.day);
		
	}

}
