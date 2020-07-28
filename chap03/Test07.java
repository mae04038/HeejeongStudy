package chap03;
import java.util.*;

public class Test07 {
	
	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height=height;
			this.vision = vision;
		}
		
		public String toString() {
			return name+" "+height+" "+vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height>d2.height) ? 1 : (d1.height<d2.height) ? -1 : 0;
			}
		}
		private static class VisionOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData v1, PhyscData v2) {
				return (v1.vision>v2.vision) ? 1 : (v1.vision<v2.vision) ? -1 : 0;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = { 
				new PhyscData("�̳���", 162, 0.3),
				new PhyscData("������", 168, 0.4),
				new PhyscData("������", 173, 0.7),
				new PhyscData("���Ѱ�", 169, 0.8),
				new PhyscData("��ȣ��", 174, 1.2),
				new PhyscData("ȫ�ر�", 171, 1.5),
				new PhyscData("�̼���", 175, 2.0),
		};
		/*
		System.out.print("��cm�� ����� ã�� �ֳ�? : ");
		int height = sc.nextInt();
		int idx = Arrays.binarySearch(x,  new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);
		
		if(idx<0)
			System.out.println("��Ұ� �����ϴ�.");
		else {
			System.out.println("x["+idx+"]�� �ֽ��ϴ�.");
			System.out.println("ã�� ������ : "+x[idx]);
		}
		*/
		
		/*�������� ���� Ư���÷°��� ���*/
		System.out.print("�÷��� ���� ����� ã�� �ֳ�? : ");
		double vision = sc.nextDouble();
		int index = Arrays.binarySearch(x,  new PhyscData("", 0, vision), PhyscData.VISION_ORDER);
		
		if(index<0)
			System.out.println("��Ұ� �����ϴ�.");
		else {
			System.out.println("x["+index+"]�� �ֽ��ϴ�.");
			System.out.println("ã�� ������ : "+x[index]);
		}
		

	}

}
