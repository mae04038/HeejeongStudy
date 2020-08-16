import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q10814 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String arr[][] = new String [n][2]; // 나이, 이름
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j] = sc.next(); // 나이 이름 순으로
			}
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			
			public int compare(String[] o1, String [] o2) {
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		// 나이순, 나이가 같으면 가입한 순
		for(int i=0;i<n;i++)
			System.out.println(arr[i][0]+" "+arr[i][1]);

		
		
	}

}
