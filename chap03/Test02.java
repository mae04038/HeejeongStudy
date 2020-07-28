package chap03;
import java.util.*;

public class Test02 {
	
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
		
		//a[n] = key;
		
		/*
		while(true) {
			if(a[i] == key)
				break;
			i++;
		}
		return i==n ? -1 : i;
		*/
		for(i=0;i<n;i++) {
			System.out.print("   |");
			drawSign(i);//System.out.print("   ");i값에 따라 
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
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		
		int idx = seqSearchSen(x, num, key);
		//스캐닝과정 추가
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key+"은(는) x["+idx+"]에 있습니다.");
	}

}
