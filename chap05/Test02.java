package chap05;
import java.util.*;

public class Test02 {

	static int gcd(int x, int y) {
		int temp;
		while(y!=0) {
			temp = y;
			y = x%y;
			x = temp;
		}
		return x;
	}
	static int gcdArray(int[] a, int n, int start) {
		if(n==2)
			return gcd(a[0], a[1]);
		else if(n>=3)
			return gcd(a[start], gcdArray(a, n-1,start+1));
		return -1;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] a;
		System.out.println(" 정수 입력1: ");
		int num1 = sc.nextInt();
		System.out.println(" 정수입력2: ");
		int num2 = sc.nextInt();
		
		System.out.println("최대공약수는"+gcd(num1, num2));
		
		System.out.println("정수 몇개의 최대공약수 ?");
		int n = sc.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		System.out.println("최대공약수는" + gcdArray(a, n, 0));

	}

}
