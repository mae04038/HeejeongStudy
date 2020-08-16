import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;



public class Q2750 {
	
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

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int[] numbers = new int[num];
		
		for(int i=0;i<numbers.length;i++)
			numbers[i] = Integer.parseInt(br.readLine());
		br.close();
		
		quickSort(numbers, num);
		
		for(int i=0;i<numbers.length;i++)
			System.out.println(numbers[i]);

	}

}
