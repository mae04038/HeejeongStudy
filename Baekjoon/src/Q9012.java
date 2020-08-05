import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		while(num-->0) {
			boolean isVPS = true;
			String input = br.readLine();
			Stack<Character> stk = new Stack<Character>();
			
			char tmp;
			for(int i=0;i<input.length();i++) {
				tmp = input.charAt(i);
				
				if(tmp == '(') {
					stk.push(tmp); // ������ �ֱ�
				}else if(tmp == ')') { // �ݴ� ��ȣ�� ��� ������ �� ������ ���� ��ȣ���� ��, �־��� ���� ��ȣ pop
					if(!stk.isEmpty()) {//������� ������
						stk.pop(); // �־��� ���� ��ȣ �ϳ�  ������
					}else { // ���������
						isVPS = false;
						break;
					}
				}
			}
			
			//��� ������ �� ��ġ�� �� �� ������ ���� �ùٸ� VPS
			if(!stk.isEmpty())
				isVPS = false;
			if(isVPS)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
