package chap01;
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int i, j;
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		
		do{
			System.out.print("몇 단 삼각형?");
			n = sc.nextInt();
		}while(n<=0);
		
		triangleLB(n);
		System.out.println();
		spiral(4);
		npiral(4);

	}
	public static void triangleLB(int n)
	{
		int i, j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++)
				System.out.print('*');
			System.out.println();
		}
		
	}
	public static void spiral(int n)
	{
		int i, j;
		int k;
		int l=n;
		for(i=1;i<=n;i++)
		{
			for(k=1;k<l;k++)
				System.out.print(' ');
			l--;
			for(j=1;j<=(i*2-1);j++)
			{
				
				System.out.print('*');
			}
			System.out.println();
			
		
		}
	}
	public static void npiral(int n)
	{
		int i, j;
		int k;
		int l=n;
		for(i=1;i<=n;i++)
		{
			for(k=1;k<l;k++)
				System.out.print(' ');
			l--;
			for(j=1;j<=(i*2-1);j++)
			{
				
				System.out.print(i);
			}
			System.out.println();
			
		
		}
	}

}
