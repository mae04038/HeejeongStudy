import java.util.Scanner;

class Q11048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][]miro = new int[n+1][m+1];
		int [][] dp = new int[n+1][m+1];
		
		for(int i=1;i<=n;i++)
			for(int j=1;j<=m;j++)
				miro[i][j] = sc.nextInt();
		
		dp[1][1] = miro[1][1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1)
					dp[i][j] = dp[i][j-1]+miro[i][j];
				else if(j==1)
					dp[i][j] = dp[i-1][j]+miro[i][j];
				else
					dp[i][j] = Math.max(Math.max(dp[i-1][j-1]+miro[i][j], dp[i-1][j]+miro[i][j]), dp[i][j-1]+miro[i][j]);
					
			}
		}
		/*
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print(" "+dp[i][j]);
			}
			System.out.println();
		}
		*/
		
		System.out.println(dp[n][m]);
		

	}

}
