import java.util.Scanner;

public class Q9095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int n;
		
		int[] dp = new int[12];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i=0;i<t;i++) {
			n = sc.nextInt(); // 어떤 수인지
			for(int j=4;j<=n;j++) {
				dp[j] = dp[j-1] + dp[j-2] +dp[j-3];
			}
			System.out.println(dp[n]);
		}
		
		
		
		
	}

}
