package Java_Essential3;
import java.util.Scanner;

public class essential3_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str [] = {"����", "����", "��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ ����.");
		
		while(true) {
			System.out.print("���� ���� ��!");
			String User = scanner.next();
			
			int AI = (int)(Math.random()*3);
			
			if(User.equals("�׸�")) {
				System.out.print("������ �����մϴ�.");
				break;
			}
			else if(str[AI].equals("����")) {
					if(User.equals("����")) {
							System.out.print("����� = ����, ��ǻ�� = ���� �����ϴ�.");
					}
					else if(User.equals("����")) {
						System.out.print("����� = ����, ��ǻ�� = ���� ����ڰ� �̰���ϴ�.");
					}
					else if(User.equals("��")) {
						System.out.print("����� = ��, ��ǻ�� = ���� �Ĥ�ǻ�Ͱ� �̰���ϴ�.");
					}
			}
			else if(str[AI].equals("����")) {
					if(User.equals("����")) {
							System.out.print("����� = ����, ��ǻ�� = ���� ��ǻ�Ͱ� �̰���ϴ�.");
					}
					else if(User.equals("����")) {
						System.out.print("����� = ����, ��ǻ�� = ���� �����ϴ�.");
					}
					else if(User.equals("��")) {
						System.out.print("����� = ��, ��ǻ�� = ���� ����ڰ� �̰���ϴ�.");
					}
			}
			else if(str[AI].equals("��")) {
					if(User.equals("����")) {
							System.out.print("����� = ����, ��ǻ�� = �� ����ڰ� �̰���ϴ�.");
					}
					else if(User.equals("����")) {
						System.out.print("����� = ����, ��ǻ�� = �� ��ǻ�Ͱ� �̰���ϴ�.");
					}
					else if(User.equals("��")) {
						System.out.print("����� = ��, ��ǻ�� = �� �����ϴ�.");
					}
				}
			}
		}
	}
