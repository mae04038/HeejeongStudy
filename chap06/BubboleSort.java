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
		for(int i=0;i<n-1;i++) { // 총 비교횟수 n-1번
			for(int j=n-1;j>i;j--) // 인덱스n-1요소부터 시작 ,  정렬한것 제외하고 나머지들(j>i)
				if(a[j-1] > a[j])// 왼쪽값이 더 크면 바꿔주기
					swap(a, j-1, j);
		}
		*/
		//Test01
		for(int j=0;j<n-1;j++)
			if(a[j]>a[j+1])
				swap(a, j, j+1);
	}
	
	static void selectionSort(int[] a, int n) {
		// 단순 선택 정렬
		for(int i=0;i<n-1;i++) {
			int min = i;
			for(int j=i+1;j<n;j++)
				if(a[j]<a[min])
					min = j; // 가장 작은 값을 갖는 인덱스가 뭔지 찾는 과정
			swap(a, i, min); // a[0]이랑 a[min] 바꾸기
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블정렬 (버전1)");
		System.out.print("요솟수: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i=0;i<nx;i++) {
			System.out.println("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x, nx);
		
		System.out.println("오름차순 정렬");
		for(int i=0;i<nx;i++)
			System.out.println("x["+i+"]="+x[i]);
		
		

	}

}
