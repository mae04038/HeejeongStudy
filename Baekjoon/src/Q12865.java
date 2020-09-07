import java.util.Scanner;

public class Q12865 {
	/*
	 * 가로는 물건, 세로는 무게인 2차원 배열
	 * 물건을 하나씩 추가하면서 무게가 j일때 넣을 수 있는 물건들의 가치의 합
	 * dp[i][j]는 기본적으로 이전 아이템(이전 행)으로 해당 무게를 채울 수 있는 경우를 넣어준다.
	 * ->우선 dp[i-1][j] 
	 * 무게(j)보다 넣어야 하는 물건의 무게가 작거나 같은 경우(다른 물건을 더 넣을 수 있는 경우)
	 * -> dp[i][j] = Math.max(dp[i-1][j-tmp_W]+tmp_V, dp[i][j])
	 * 나머지 무게(j-해당행물건무게)만큼 넣을 수 있는 값을 더한 후, 현재 있는 값과 최대값 비교
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int [] W = new int[N+1];
		int [] V = new int[N+1];
		
		int [][]dp = new int[N+1][K+1];
		
		for(int i=1;i<=N;i++) {
			W[i] = sc.nextInt();
			V[i] = sc.nextInt();
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=K;j++) {
				int tmp_V = V[i];
				int tmp_W = W[i];
				
				dp[i][j] = dp[i-1][j];
				
				if(j>=tmp_W)
					dp[i][j] = Math.max(dp[i-1][j-tmp_W]+tmp_V, dp[i-1][j]);
			}
		}
		
		System.out.println(dp[N][K]);

	}

}
