import java.util.*;
public class Q2953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int score[][] = new int[5][4];
		int sum[] = new int[5];
		int max;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				score[i][j] = sc.nextInt();
				System.out.print(" ");
				sum[i] += score[i][j];
			}
			System.out.println();
		}
		
		max = sum[0];
		for(int i=0;i<5;i++) {
			if(sum[i]<sum[i+1])
				max = sum[i+1];
			else
				max = sum[i];
		}
		
		System.out.println()

	}

}
