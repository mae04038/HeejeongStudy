package chap03;
import java.util.*;

public class Test04 {
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		System.out.print("   |");
		for(int j=0;j<n;j++) {
			System.out.printf("%3d", j);
		}
		System.out.println();
		System.out.println("---+-----------------------------");
		//System.out.print("   |");
		
		do {
			int pc = (pl+pr)/2;
			
			System.out.print("   |");
			for(int i=0;i<n;i++) {
				if(i==pl)
					System.out.print(" <-");
				else if(i==pc)
					System.out.print("  +");
				else if(i==pr)
					System.out.print(" ->");
				else
					System.out.print("   ");
			}
			System.out.println();
			
			System.out.printf("%3d|", pc);
			for(int j=0;j<n;j++) {
				System.out.printf("%3d", a[j]);
			}
			System.out.println();
			
			if(a[pc] == key)
				return pc;
			else if(a[pc] < key)
				pl=pc+1;
			else
				pr = pc - 1;
			
		}while(pl<=pr);
			
		return -1;
	}
	
	static int drawSign(int n) {
		
		for(int i=0;i<n;i++)
			System.out.print("   ");
		
		return 0;
	}

	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		
		System.out.print("   |");
		for(int j=0;j<n;j++) {
			System.out.printf("%3d", j);
		}
		System.out.println();
		System.out.println("---+-----------------------------");
		
		for(i=0;i<n;i++) {
			System.out.print("   |");
			drawSign(i);  //System.out.print("   ");i값에 따라 
			System.out.println("  *");
			System.out.printf("%3d|", i);
			for(int j=0;j<n;j++) {
				System.out.printf("%3d", a[j]);
			}
			System.out.println();
			if(a[i] == key) {

				break;
			}
		}
		return i==n ? -1 : i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		for(int i=1;i<num;i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		
		int idx = binSearch(x, num, key);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key+"은(는) x["+idx+"]에 있습니다.");

	}

}
