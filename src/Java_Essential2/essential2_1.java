package Java_Essential2;
import java.util.Scanner;
public class essential2_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �׼��� �Է��ϼ���>>");
	int money = scanner.nextInt();
	int a = money / 50000;
	int b = money % 50000;
	int c = b / 10000;
	int d = b % 10000;
	int e = d / 1000;
	int f = d % 1000;
	int g = f / 500;
	int h = f % 500;
	int i = h / 100;
	int j = h % 100;
	int k = j / 10;
	int l = j % 10;
	System.out.println("������" + a + "��, ����" + c + "��, õ��" + e + "��, �����" + g + "��, ���" + i + "��, �ʿ�" + k + "��, �Ͽ�" + l + "��");
	
	scanner.close();
	}

}
