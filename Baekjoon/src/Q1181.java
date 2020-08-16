import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Q1181 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		//ArrayList<String> str = new ArrayList<String>();
		String [] str = new String[num];
		
		
		for(int i=0;i<num;i++) {
			str[i] = br.readLine();
		}
		br.close();
		
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String x, String y) {
				// TODO Auto-generated method stub
				return Integer.compare(x.length(), y.length());
			}
			
		});
		
		// ���� ���̸� ���ĺ� �� ����
		int j, len, tmp;
		for(int i=0;i<num;i++) {
			len = str[i].length();
			
			for(j = i+1;j<num;j++) {
				//��
				tmp = str[j].length();
				if(len != tmp) // ���̰� ���� ������ ���� ���ڿ� ���ؾ� �ϹǷ� �Ѿ��
					break;
			}
			Arrays.sort(str, i, j); // ���ĺ� �� ����
			i = j-1; // ���� ���ڶ� ���ϱ� ����
		}
		
		System.out.println(str[0]);
		for(int i=1;i<num;i++) {
			if(str[i-1].equals(str[i]))
				continue; // ���ڿ� ������ ���� �ݺ����� �Ѿ.
			System.out.println(str[i]);
		}
		

	}

}
