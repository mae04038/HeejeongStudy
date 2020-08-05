package chap05;

public class Test09 {

	static boolean[] flagA = new boolean[8];
	static boolean[] flagB = new boolean[15];
	static boolean[] flagC = new boolean[15];
	static int[] pos = new int[8];
	
	static void print() {
		for(int i=0;i<8;i++) {
			System.out.printf("%2d", pos[i]);
		}
		/*
		System.out.println();
		for(int i=0;i<8;i++) {//i=행
			for(int j=0;j<8;j++) {//j=열
				if(i == pos[j])
					System.out.print("& ");//퀸 출력
				else
					System.out.print("# ");
			}
			System.out.println();
		}
		*/
		System.out.println();
	}
	
	static void set(int i) {
		
		/*
		for(int j=0; j<8;j++) {
			if(flagA[j] == false && flagB[i+j] == false && flagC[i-j+7] == false) {
				pos[i] = j;
				if(i==7)
					print();
				else {
					flagA[j] = flagB[i+j] = flagC[i-j+7] = true;
					set(i+1); //재귀
					flagA[j] = flagB[i+j] = flagC[i-j+7] = false;
				}
			}
		}
		*/
		//비재귀
		int j;
		int[] stk = new int[8];
		Start : while(true) {
			j = 0;
			while (true) {
				while (j < 8) {
					if (!flagA[j] && !flagB[i + j] && !flagC[i - j + 7]) {
						pos[i] = j; // 퀸을 j행에(가로) - j행i열에 퀸이 위치
						if (i == 7) 
							print();
						else {
							flagA[j] = flagB[i + j] = flagC[i - j + 7] = true; // 해당 행, 주위대각선위치
							stk[i++] = j; // i 열의 행을 Push - 퀸을 위치시킴.
							continue Start;
						}
					}
					j++;
				}
				if (--i == -1)
					return;
				j = stk[i]; // i 열의 행을 Pop
				flagA[j] = flagB[i + j] = flagC[i - j + 7] = false; // 배치 안됨
				j++;
			}
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set(0);
	}

}
