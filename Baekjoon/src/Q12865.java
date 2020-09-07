import java.util.Scanner;

public class Q12865 {
	/*
	 * ���δ� ����, ���δ� ������ 2���� �迭
	 * ������ �ϳ��� �߰��ϸ鼭 ���԰� j�϶� ���� �� �ִ� ���ǵ��� ��ġ�� ��
	 * dp[i][j]�� �⺻������ ���� ������(���� ��)���� �ش� ���Ը� ä�� �� �ִ� ��츦 �־��ش�.
	 * ->�켱 dp[i-1][j] 
	 * ����(j)���� �־�� �ϴ� ������ ���԰� �۰ų� ���� ���(�ٸ� ������ �� ���� �� �ִ� ���)
	 * -> dp[i][j] = Math.max(dp[i-1][j-tmp_W]+tmp_V, dp[i][j])
	 * ������ ����(j-�ش��๰�ǹ���)��ŭ ���� �� �ִ� ���� ���� ��, ���� �ִ� ���� �ִ밪 ��
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
