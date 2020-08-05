package chap05;
import java.util.*;

public class Test01 {
	
	static int factorial(int x) {
		int result = 1;
		while(x>0) {
		result *= x--;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("팩토리얼 숫자 1: ");
		int num1 = sc.nextInt();
		System.out.println("팩토리얼은 "+factorial(num1));
		
		

		
	}

}
