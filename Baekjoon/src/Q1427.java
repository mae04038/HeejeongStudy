import java.util.*;

public class Q1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		char[] digit = new char[num.length()];
		
		for(int i=0;i<num.length();i++) {
			digit[i] = num.charAt(i);
			//System.out.println(digit[i]);
		}
		
		
		Arrays.sort(digit);
		
		for(int i=0;i<4;i++)
			System.out.print(digit[i]);

	}

}
