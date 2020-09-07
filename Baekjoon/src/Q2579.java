import java.util.Scanner;

public class Q2579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] floor = new int[n+1];
		
		for(int i=1;i<=n;i++)
			floor[i] = sc.nextInt();
		
		int[] dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = floor[1];
		dp[2] = Math.max(dp[1]+floor[2], floor[2]);
		for(int i=3;i<=n;i++) {
			dp[i] = Math.max(dp[i-3]+floor[i-1]+floor[i], dp[i-2]+floor[i]);
		}
		
		System.out.println(dp[n]);
		
		

	}

}
