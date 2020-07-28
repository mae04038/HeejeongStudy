package chap03;
import java.util.*;

public class Test03 {
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int numOfIndex = 0;
		int i=0;
		int j=0;
		
		for(i=0;i<n;i++) {
			if(a[i] == key)
				idx[j++] = i;
		}
		numOfIndex = j;
		
		for(int k=0;k<j;k++)
			System.out.println(idx[k]);
		
		return numOfIndex;
	}

    static int drawSign(int n) {
		
		for(int i=0;i<n;i++)
			System.out.print("   ");
		
		return 0;
	}

	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		
		//a[n] = key;
		
		/*
		while(true) {
			if(a[i] == key)
				break;
			i++;
		}
		return i==n ? -1 : i;
		*/
		for(i=0;i<=n;i++) {
			if(a[i] == key)
				break;
		}
		return i==n ? -1 : i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int index[] = new int[20];
		
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] x = new int[num+1];
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� ��: ");
		int key = sc.nextInt();
		
		int idx = seqSearchSen(x, num, key);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(key+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
		
		System.out.printf("key�� ��ġ�ϴ� ��ڼ��� %d�Դϴ�.", searchIdx(x, num, key, index));

	}

}
