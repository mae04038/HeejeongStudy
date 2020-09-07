import java.util.Scanner;

public class Q11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] arr = new int[n+1];
		int []  dp = new int[n+1];
		
		
		for(int i=1;i<=n;i++) {
			arr[i] = sc.nextInt();
			dp[i] = 1;
			for(int j=1;j<=i;j++) {
				if(arr[j]<arr[i] && dp[i]<=dp[j])
					dp[i] = dp[j]+1;
			}
		}
		int max = 0;
		for(int i=1;i<=n;i++) {
			if(dp[i]>max)
				max = dp[i];
		}
		System.out.println(max);
		
		

	}

}
