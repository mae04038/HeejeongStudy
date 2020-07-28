package chap03;
import java.util.*;

public class Test02 {
	
	static int drawSign(int n) {
		
		for(int i=0;i<n;i++)
			System.out.print("   ");
		
		return 0;
	}

	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		
		System.out.print("   |");
		for(int j=0;j<n;j++) {
			System.out.printf("%3d", j);
		}
		System.out.println();
		System.out.println("---+-----------------------------");
		
		//a[n] = key;
		
		/*
		while(true) {
			if(a[i] == key)
				break;
			i++;
		}
		return i==n ? -1 : i;
		*/
		for(i=0;i<n;i++) {
			System.out.print("   |");
			drawSign(i);//System.out.print("   ");i���� ���� 
			System.out.println("  *");
			System.out.printf("%3d|", i);
			for(int j=0;j<n;j++) {
				System.out.printf("%3d", a[j]);
			}
			System.out.println();
			if(a[i] == key) {

				break;
			}
		}
		return i==n ? -1 : i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� ��: ");
		int key = sc.nextInt();
		
		int idx = seqSearchSen(x, num, key);
		//��ĳ�װ��� �߰�
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(key+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
	}

}
