package Java_Essential4;
import java.util.*;
class essential4_3 {
	private int width, height;
	public essential4_3(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() {
		return width*height;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		essential4_3[] Array = new essential4_3[4];
		int sum = 0;
		
		for(int i = 0; i < 4; i++) {
			System.out.print((i + 1) + "�ʺ�� ���� >> ");
			Array[i] = new essential4_3(sc.nextInt(), sc.nextInt());
			sum += Array[i].getArea();
		}
		System.out.println("�����Ͽ����ϴ�.");
		System.out.println("�簢���� ��ü ����" + sum);

	}

}
