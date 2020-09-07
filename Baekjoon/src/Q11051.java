import java.util.Scanner;

public class Q11051 {
	
	static int bin(int N, int K) {
		if(K==0||K==N) {
			return 1;
		}else {
			return bin(N-1, K-1)+bin(N-1, K);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int result = bin(N, K);
		
		System.out.println(result);
	}

}