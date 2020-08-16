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
		
		// 같은 길이면 알파벳 순 정렬
		int j, len, tmp;
		for(int i=0;i<num;i++) {
			len = str[i].length();
			
			for(j = i+1;j<num;j++) {
				//비교
				tmp = str[j].length();
				if(len != tmp) // 길이가 같지 않으면 다음 문자열 비교해야 하므로 넘어가기
					break;
			}
			Arrays.sort(str, i, j); // 알파벳 순 정렬
			i = j-1; // 다음 문자랑 비교하기 위함
		}
		
		System.out.println(str[0]);
		for(int i=1;i<num;i++) {
			if(str[i-1].equals(str[i]))
				continue; // 문자열 같으면 다음 반복으로 넘어감.
			System.out.println(str[i]);
		}
		

	}

}
