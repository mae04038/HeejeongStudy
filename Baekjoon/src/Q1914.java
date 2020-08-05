import java.util.Scanner;

public class Q1914 {
	
	static void move(int no, int x, int y) {
		if(no>1)
			move(no-1, x, 6-x-y);
		System.out.println(x+" "+y);
		if(no>1)
			move(no-1, 6-x-y, y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 원반개수
		
		move(num, 1, 3);

	}

}
