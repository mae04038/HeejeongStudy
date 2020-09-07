import java.util.Scanner;

public class Q11050 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[][] memory = new int[N+1][K+1];
		
		for(int i=0;i<memory.length;i++) {
			for(int j=0;j<=i;j++) {
				if(i==j || j==0)
					memory[i][j] = 1;
				else
					memory[i][j] = memory[i-1][j-1] + memory[i-1][j];
			}
		}
		
		int result = memory[N][K] % 10007;
		
		System.out.println(result);
	}

}
