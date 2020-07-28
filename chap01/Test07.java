package chap01;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n의 값을 입력하세요 : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n ; i++)
		{
			sum += i;
			if(i != n)
				System.out.print(i+"+");
		}
		System.out.print(n+"="+sum);

	}

}
