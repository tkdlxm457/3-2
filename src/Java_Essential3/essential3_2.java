package Java_Essential3;

import java.util.Scanner;

public class essential3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		try {
			int a = scanner.nextInt();
			
			if(a%2 == 0) {
				System.out.print("¦��");
			}
			else {
				System.out.print("Ȧ��");
			}
			
		}
		catch(Exception e) {
			System.out.print("������ �Է��ϼ���");
		}
		
		scanner.close();

	}


}
