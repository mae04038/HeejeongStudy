import java.util.Scanner;

public class Q2293 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 동전의 가지수
		int k = sc.nextInt(); // 동전 가치의 합
		int [] coin = new int[n+1];
		int [][] dp = new int[n+1][k+1];
		
		for(int i=1;i<=n;i++)
			coin[i] = sc.nextInt();
		
		dp[1][1] = 1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				if(i==1) 
					dp[i][j] = 1;
				
				if(i>1 && j<coin[j])
					dp[i][j] = dp[i-1][j];
				else if(i>1&&j==coin[j])
					dp[i][j] = dp[i-1][j] + 1;
				else
					dp[i][j] = dp[i][j-coin[i]]+dp[i-1][j];
				
					
			}
		}
		System.out.println(dp[n][k]);
		

	}

}
