package Java_Essential4;
import java.util.*;
class essential4_2 {
	private String name, tel;
	public essential4_2(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getNmae() {
		return name;
		}
	public String getTel() {
		return tel;
		}
public class PhoneManager{
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο��� >> ");
		int Persons = sc.nextInt();
		
		essential4_2 [] Array = new essential4_2[Persons];
		
		for(int i = 0; i < Persons; i++) {
				System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�) >>");
				Array[i] = new essential4_2(sc.next(), sc.next());
			}
		
		System.out.print("����Ǿ����ϴ�.");
		
		label : while(true) {
				System.out.print("�˻��� �̸�>>");
				String serchName = sc.next();
				
				for(int i = 0; i < Persons; i++) {
					if(serchName.equals("exit")) {
						break label;
					}
					else if(serchName.equals(Array[i].getNmae())) {
							System.out.println(Array[i].getNmae() + "�� ��ȣ�� " + Array[i].getTel() + "�Դϴ�.");
					}
					else if(!serchName.equals(Array[i].getNmae()) && i == (Persons - 1)) {
						System.out.println(serchName + "��(��)�����ϴ�.");
					}
				}
			}
		}
	
}
