import java.util.Scanner;

public class Q1149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int dp[][] = new int[N+1][3];
		
		for(int i=1;i<=N;i++) {
			dp[i][0] = sc.nextInt();//red
			dp[i][1] = sc.nextInt();//green
			dp[i][2] = sc.nextInt();//blue
		}
			
		
		for(int i=2;i<=N;i++) {
			dp[i][0] += Math.min(dp[i-1][1], dp[i-1][2]);
			dp[i][1] += Math.min(dp[i-1][0],dp[i-1][2]);
			dp[i][2] += Math.min(dp[i-1][0], dp[i-1][1]);;
		}
		
		System.out.println(Math.min(Math.min(dp[N][0], dp[N][1]), dp[N][2]));

	}

}
