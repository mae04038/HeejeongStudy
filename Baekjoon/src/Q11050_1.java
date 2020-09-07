import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11050_1 {
	
	static int factorial(int num) {
		int result =1;
		if(num>0) {
			for(int i= num;i>=1;i--) {
				result *= i;
			}
			return result;
		}
		else
			return 1;
	}

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		br.close();
		/*
		int upper = factorial(N);
		int down = factorial(K);
		int down2 = factorial(N-K);
		*/
		int result = factorial(N) / (factorial(K) * factorial(N-K));
		
		System.out.println(result);

	}

}

