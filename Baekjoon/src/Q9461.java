import java.util.Scanner;

public class Q9461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] test = new int[n];
		int [] dp ;
		
		
		for(int i=0;i<n;i++) {
			test[i] = sc.nextInt();
			dp = new int[test[i]+1];
			dp[1] = 1;
			dp[2] = 1;
			dp[3] = 1;
			for(int j=4;j<=test[i];j++)
				dp[j] = dp[j-3]+dp[j-2];
			System.out.println(dp[test[i]]);
		}
		
		
		

	}

}
