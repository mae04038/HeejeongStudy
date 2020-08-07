package chap06;
import java.util.Scanner;

public class BubboleSort {
	
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	static void bubbleSort(int[] a, int n) {
		/*
		for(int i=0;i<n-1;i++) { // �� ��Ƚ�� n-1��
			for(int j=n-1;j>i;j--) // �ε���n-1��Һ��� ���� ,  �����Ѱ� �����ϰ� ��������(j>i)
				if(a[j-1] > a[j])// ���ʰ��� �� ũ�� �ٲ��ֱ�
					swap(a, j-1, j);
		}
		*/
		//Test01
		for(int j=0;j<n-1;j++)
			if(a[j]>a[j+1])
				swap(a, j, j+1);
	}
	
	static void selectionSort(int[] a, int n) {
		// �ܼ� ���� ����
		for(int i=0;i<n-1;i++) {
			int min = i;
			for(int j=i+1;j<n;j++)
				if(a[j]<a[min])
					min = j; // ���� ���� ���� ���� �ε����� ���� ã�� ����
			swap(a, i, min); // a[0]�̶� a[min] �ٲٱ�
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� (����1)");
		System.out.print("��ڼ�: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.println("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x, nx);
		
		System.out.println("�������� ����");
		for(int i=0;i<nx;i++)
			System.out.println("x["+i+"]="+x[i]);
		
		

	}

}
