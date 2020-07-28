package chap02;
import java.util.*;

public class Test02 {
	static void swap(int[] a, int idx1, int idx2)
	{
		int t=a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	static void reverse(int[] a)
	{
		for(int i=0;i<a.length/2;i++)
		{
			swap(a, i, a.length-i-1);
			System.out.println("a["+i+"]�� a["+(5-i)+"]�� ��ȯ�մϴ�.");
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}
	static int sumOf(int[] a)
	{
		int sum=0;
		
		for(int i=0;i<a.length;i++)
			sum += a[i];
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("��ڼ�: ");
		num = sc.nextInt();
		
		int a[] = new int[num];
		
		int i;
		for(i=0;i<num;i++)
		{
			a[i] = sc.nextInt();
			System.out.print(" ");
		}
		
		reverse(a);
		
		System.out.println("���� ������ ���ƽ��ϴ�.");
		
		System.out.println("����� ���� : "+sumOf(a));

	}

}
