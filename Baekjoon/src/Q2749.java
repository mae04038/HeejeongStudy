import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// n이 90일 때는 int형을 넘어가므로 long형으로
public class Q2749 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n = Long.parseLong(br.readLine());
		//br.close();
		long dp[] = new long[1010];
		int pisano = 1500000;
		
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2;i<=n;i++) {
			dp[i] = (dp[i-1] + dp[i-2])%1000000;
		}
		if(n>=pisano)
			n %= pisano;
		
		System.out.println(dp[(int) n]);

	}

}
