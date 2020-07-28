package chap02;
import java.util.*;

public class Test11 {
	
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31}, // ��� 0
			{31,29,31,30,31,30,31,31,30,31,30,31} // ���� 1
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
			
			while(tmp.day>mdays[isLeap(tmp.year)][tmp.month-1]) { // n�� ���� ����� �ش� �� �ϼ����� ū ��� �ݺ�
				tmp.day -= mdays[isLeap(tmp.year)][tmp.month-1]; // n�� ���� ������� �ش� �� �ϼ��� ���ش�. 
				if(++tmp.month > 12) {//12�� �� ���
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
			
			while(tmp.day <0) { // ����� ��� �� ���� ����ϸ� �Ǵϱ�
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

		System.out.print("��: ");
		int year = sc.nextInt();
		System.out.print("��: ");
		int month = sc.nextInt();
		System.out.print("��: ");
		int day = sc.nextInt();
		
		YMD date = new YMD(year, month, day);
		
		System.out.print(" �� �� ��/���� ��¥�� ���ұ�?");
		int n = sc.nextInt();
		
		YMD afterdate = date.after(n);
		System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d�� �Դϴ�.", n, afterdate.year, afterdate.month, afterdate.day);
		
		YMD beforedate = date.before(n);
		System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d�� �Դϴ�.", n, beforedate.year, beforedate.month, beforedate.day);
		
	}

}
