import java.util.*;
public class Q2953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int score[][] = new int[5][4];
		int sum[] = {0,0,0,0,0};
		int max=0;
		int idxOfMax=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				score[i][j] = sc.nextInt();
				sum[i] += score[i][j];
			}
			
			if(max <sum[i]) {
				max = sum[i];
				idxOfMax = i+1;
			}
		}
		
		System.out.println(idxOfMax+" "+max);

	}

}
