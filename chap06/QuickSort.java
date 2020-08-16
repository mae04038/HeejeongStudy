package chap06;

import java.util.Scanner;

public class QuickSort {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl+pr) /2];
		
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			if(pl<=pr)
				swap(a, pl++, pr--);
		}while(pl<=pr);
		
		if(left<pr) quickSort(a, left, pr);
		if(pl<right) quickSort(a, pl, right);
	}
	
	static void quickSort(int[] a, int n) {
		int pl = 0;
		int pr = n-1;
		int x = a[(pl+pr) /2];
		
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			if(pl<=pr)
				swap(a, pl++, pr--);
		}while(pl<=pr);
		
		if(0<pr) quickSort(a, 0, pr);
		if(pl<n-1) quickSort(a, pl, n-1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("퀵 정렬");
		System.out.print("요솟수: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		quickSort(x, 0, nx-1);
		quickSort(x, nx);
		
		System.out.println("오름차순으로 정렬");
		for(int i=0;i<nx;i++)
			System.out.println("x["+i+"]="+x[i]);
		

	}

}
