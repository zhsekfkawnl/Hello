package day02;

public class Ex01 {
	public static void main(String[] args) {
		// 1. �غ��� 5�̰� ���̰� 3�� �ﰢ���� ���̸� ���ؼ� ����ϼ���.
		//      �ﰢ���� ���� ����
		//          ���� = �غ� * ���� * 0.5
		int width = 5;
		int height = 3;
		double soo = 0.5;
		
		double area1 = width * height * soo;
		
//		System.out.println("no1 * no2 * 0.5 : " + no1 * no2 * 0.5);
		
		// 2. ���ΰ� 5, ���ΰ� 7�� �簢���� ���̸� ���ؼ� ����ϼ���.
		//           ���� = ���� * ����
		// ��������� �ʱ�ȭ
		int garo = 5;
		int sero = 7;
		int area2 = garo * sero;
		
		
		// 3. �������� 2�� ���� �ѷ��� ���ؼ� ����ϼ���.
		//          �ѷ� = 2 * ������ * 3.14
		// ���� ����� �ʱ�ȭ
		int rad = 2;
		double Pi = 3.14;
		double arround = 2 * rad * Pi;
		
		
		// ���� ������ �����ʹ� ������ ����� ������ �����ؼ� ����ϼ���.
		
		System.out.println("1. �غ���" + width + "�̰� ���̰� "+ height +"�� �ﰢ���� ������" + area1 + " �Դϴ�.");
		System.out.println("2. ���ΰ� "+ garo +"�̰��ΰ�"+ sero +"�� �簢���� ���̴�" +area2 + "�Դϴ�.");
		System.out.println("3. �������� " + rad + " �� ���� �ѷ���" + arround + "�Դϴ�.");
	        // 4. ���� ������ �����ʹ� ������ ����� ������ �����ؼ� ����ϼ���.
	}

}
