package chap01;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ��: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n)
		{
			sum += i;
			i++;
		}
		System.out.println("���� n+1 �� ��: "+ i);

	}

}
