import java.util.Scanner;

public class Q1932 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [][] dp = new int [N+1][N+1];
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++)
				dp[i][j] = sc.nextInt();
		}
		
		for(int i=2;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1)
					dp[i][j] += dp[i-1][1];
				else if(i==j)
					dp[i][j] += dp[i-1][j-1];
				else
					dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j]);
			}
		}
		int max = dp[N][1];
		for(int i=2;i<=N;i++) {
			if(dp[N][i] > max)
				max = dp[N][i];
			else
				continue;
		}
		System.out.println(max);

	}

}
