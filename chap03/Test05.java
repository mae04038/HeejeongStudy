package chap03;
import java.util.*;

public class Test05 {
	
	static int binSearchX(int[] a, int n, int key) {
		int firstIndex;
		int midIndex = binSearch(a, n, key);
		
		while(a[midIndex] == a[midIndex-1]) {
			midIndex--;
		}
    	firstIndex = midIndex;
		
		
		return firstIndex;
	}
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl+pr)/2;
			if(a[pc] == key)
				return pc;
			else if(a[pc] < key)
				pl=pc+1;
			else
				pr=pc-1;
		}while(pl<=pr);
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է��ϼ���.");
		
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		for(int i=1;i<num;i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]);
		}
		
		System.out.print("�˻��� ��: ");
		int key = sc.nextInt();
		
		int idx = binSearch(x, num, key);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(key+"��(��) x["+idx+"]�� �ֽ��ϴ�.");

		System.out.printf("�� ���� ��Ҵ� %d�Դϴ�.\n", binSearchX(x, num, key));

	}

}
