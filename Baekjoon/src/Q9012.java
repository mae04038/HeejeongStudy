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
					stk.push(tmp); // 무조건 넣기
				}else if(tmp == ')') { // 닫는 괄호인 경우 스택의 맨 위값이 여는 괄호인지 비교, 넣었던 여는 괄호 pop
					if(!stk.isEmpty()) {//비어있지 않으면
						stk.pop(); // 넣었던 여는 괄호 하나  꺼내기
					}else { // 비어있으면
						isVPS = false;
						break;
					}
				}
			}
			
			//모든 과정을 다 마치고 난 후 스택이 비어야 올바른 VPS
			if(!stk.isEmpty())
				isVPS = false;
			if(isVPS)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
