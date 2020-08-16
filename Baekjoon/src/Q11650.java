import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q11650 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int [][] arr = new int[num][2];
		String[] str = new String[2];
		
		for(int i=0;i<num;i++) {
			str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]);
			arr[i][1] = Integer.parseInt(str[1]);
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] idx1, int[] idx2) {
				// TODO Auto-generated method stub
				if(idx1[0] == idx2[0]) {
					return Integer.compare(idx1[1], idx2[1]);
				}
				return Integer.compare(idx1[0], idx2[0]);
			}
			
		});
		
		for(int i=0;i<num;i++)
			System.out.println(arr[i][0]+" "+arr[i][1]);
		
	}

}
