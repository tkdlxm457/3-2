package Java_Essential4;
import java.util.*;
class essential4_4 {
		private String name;
		public essential4_4(String name) {
				this.name = name;
		}
		public String getName() {
			return name;
	}
public class WordGameApp{
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�?>>");
		int pNum = sc.nextInt();
		essential4_4 p[] = new essential4_4[pNum];
		
		for(int i = 0; i <pNum; i++) {
			System.out.print("�������� �̸��� �Է��ϼ��� >> ");
			p[i] = new essential4_4(sc.next());
		}
		
		System.out.print("�����ϴ� �ܾ�� '�ƹ���' �Դϴ�.");
		int i = 0;
		String word = "�ƹ���";
		int lastIndex = word.length() - 1;
		char lastChar = word.charAt(lastIndex);
		char firstChar = word.charAt(0);
		while(true) {
				System.out.print(p[i].getName() + ">>");
				String nextword = sc.next();
				firstChar = nextword.charAt(0);
				if(lastChar != firstChar) {
					System.out.println(p[i].getName() + "��(��) �����ϴ�.");
					return;
				}
				lastIndex = nextword.length() - 1;
				lastChar = nextword.charAt(lastIndex);
				i++;
				if(i > 2) {
						i = 0;
				}
		}

	}

	}

