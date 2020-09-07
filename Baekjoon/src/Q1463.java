import java.util.Scanner;

public class Q1463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = 0;
		//dp[2] = 1;
		//dp[3] = 1;
		//int num2=1, num3 = 1, num6 =1;
		for(int i=2;i<=n;i++) {
			dp[i] = dp[i-1]+1;
			if(i%2==0)
				dp[i] = Math.min(dp[i], dp[i/2]+1);
			if(i%3==0)
				dp[i] = Math.min(dp[i], dp[i/3]+1);
		}

		System.out.println(dp[n]);
		
	}

}
