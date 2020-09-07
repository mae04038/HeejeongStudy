import java.util.Scanner;

public class Q1904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] dp = new int[n+1];
		dp[0] = 1;
		dp[1] =1;
		for(int i=2;i<=n;i++) {
			dp[i] = (dp[i-1]+dp[i-2])%15746;
		}
		
		System.out.println(dp[n]);

	}

}
