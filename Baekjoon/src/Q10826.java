import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Q10826 {
	
	/**
	 * n�� �ִ� 10000
	 * long������ �ϸ� �����÷ο� �߻�
	 * �ڹٿ����� BigInteger���
	 * 
	 */
	
	static BigInteger arr[];

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		//br.close();
		
		arr = new BigInteger[n+1];
		
		arr[0] = BigInteger.ZERO;
		arr[1] = BigInteger.ONE;
		
		for(int i=2;i<=n;i++)
			arr[i] = arr[i-2].add(arr[i-1]);
		
		bw.write(arr[n]+" ");
		bw.flush();
		br.close();

	}

}
