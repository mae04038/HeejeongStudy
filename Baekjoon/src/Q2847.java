import java.util.*;
	
public class Q2847 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=0;
		int level = sc.nextInt();
		
		int lv[] = new int[level];
		for(int i=0;i<level;i++) {
			lv[i] = sc.nextInt();
		}
		
		for(int i=0;i<level;i++) {
			if(i==3)
				break;
			if(lv[i+1] < lv[i]) {
				while(lv[i+1]<=lv[i]) {
					lv[i] -= 1;
					num++;
				}
			}
		}
		
		System.out.println(num);

	}

}
