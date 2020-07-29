import java.util.*;
public class Q3052 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arraylist = new ArrayList<>(); 
		
		int[] a = new int[10];
		int[] b = new int[10];
		
		System.out.println("10개 입력");
		
		for(int i=0; i<10;i++) {
			a[i] = sc.nextInt();
			if(a[i]>1000 || a[i]<0) {
				System.out.print("다시 입력: ");
				a[i] = sc.nextInt();
			}
			b[i] = a[i] % 42;
			
			if(!(arraylist.contains(b[i]))) {
				arraylist.add(b[i]);
			}
			
		}
		
		System.out.println("서로다른 나머지의 개수는 "+arraylist.size()+"입니다.");
		

	}

}
