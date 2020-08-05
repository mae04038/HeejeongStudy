package chap05;
import java.util.*;

public class Test08 {
	
	static boolean[] flagA = new boolean[8];
	static boolean[] flagB = new boolean[15];
	static boolean[] flagC = new boolean[15];
	static int[] pos = new int[8];
	
	static void print() {
		for(int i=0;i<8;i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
		for(int i=0;i<8;i++) {//i=Çà
			for(int j=0;j<8;j++) {//j=¿­
				if(i == pos[j])
					System.out.print("& ");//Äý Ãâ·Â
				else
					System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void set(int i) {
		for(int j=0; j<8;j++) {
			if(flagA[j] == false && flagB[i+j] == false && flagC[i-j+7] == false) {
				pos[i] = j;
				if(i==7)
					print();
				else {
					flagA[j] = flagB[i+j] = flagC[i-j+7] = true;
					set(i+1);
					flagA[j] = flagB[i+j] = flagC[i-j+7] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set(0);

	}

}
