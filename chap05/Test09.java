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
		for(int i=0;i<8;i++) {//i=��
			for(int j=0;j<8;j++) {//j=��
				if(i == pos[j])
					System.out.print("& ");//�� ���
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
					set(i+1); //���
					flagA[j] = flagB[i+j] = flagC[i-j+7] = false;
				}
			}
		}
		*/
		//�����
		int j;
		int[] stk = new int[8];
		Start : while(true) {
			j = 0;
			while (true) {
				while (j < 8) {
					if (!flagA[j] && !flagB[i + j] && !flagC[i - j + 7]) {
						pos[i] = j; // ���� j�࿡(����) - j��i���� ���� ��ġ
						if (i == 7) 
							print();
						else {
							flagA[j] = flagB[i + j] = flagC[i - j + 7] = true; // �ش� ��, �����밢����ġ
							stk[i++] = j; // i ���� ���� Push - ���� ��ġ��Ŵ.
							continue Start;
						}
					}
					j++;
				}
				if (--i == -1)
					return;
				j = stk[i]; // i ���� ���� Pop
				flagA[j] = flagB[i + j] = flagC[i - j + 7] = false; // ��ġ �ȵ�
				j++;
			}
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set(0);
	}

}
