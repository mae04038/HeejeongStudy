package chap05;
import java.util.*;

import chap04.IntStack;
/**
 * Test04, Test05
 * @author 장희정
 *
 */
public class Test04 {
	
	static void recur(int n) {
		if(n>0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	static void recur2(int n) {
		if(n>0) {
			recur2(n-2);
			System.out.println(n);
			recur2(n-1);
		}
	}
	static void recur3(int n) {
		
		
		IntStack s = new IntStack(n);
		
		while(true) {
			if(n>0) {
				s.push(n);
				n=n-1;
				s.push(n);
				n=n-2;
				s.push(n);
				n=n-2;
				continue;
				
				//System.out.println(n);
				//n=n-2;
			}
			if(s.isEmpty() != true) {
				n=s.pop();
				System.out.println(n);
				n=n-1;
				
				continue;
			}
			break; // 스택이 비면 완료
		}
		
		/*
		if(n>0) {
			recur3(n-1);
			recur3(n-2);
			System.out.println(n);
		}
		*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int x = sc.nextInt();
		
		recur(x);
		System.out.println("--------");
		recur2(x);
		System.out.println("--------");
		recur3(x);

	}

}
