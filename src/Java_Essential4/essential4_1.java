package Java_Essential4;
import java.util.*;
class essential4_1 {
	private String name, tel;
	public essential4_1(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getNmae() {
		return name;
		}
	public String getTel() {
		return tel;
		}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸��� ��ȣ �Է�>>");
		essential4_1 first = new essential4_1(scanner.next(), scanner.next());
		System.out.print("�̸��� ��ȣ �Է�>>");
		essential4_1 second = new essential4_1(scanner.next(), scanner.next());
		
		System.out.println(first.getNmae() + "�� ��ȣ" + first.getTel());
		System.out.println(second.getNmae() + "�� ��ȣ" + second.getTel());
	}

}
