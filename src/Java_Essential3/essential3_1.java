package Java_Essential3;

import java.util.*;

class essential3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        while (true) {
            int k = r.nextInt(100);
            int min = 0, max = 99;
            System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");

            for (int i = 0;; i++) {
                System.out.printf("%d - %d\n", min, max);
                System.out.print(i + 1 + ">>");
                int num = scanner.nextInt();
                if (num > k) {
                    System.out.println("�� ����");
                    max = num;
                } else if (num < k) {
                    System.out.println("�� ����");
                    min = num;
                } else if (num == k) {
                    System.out.println("�¾ҽ��ϴ�.");
                    System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
                    char select = scanner.next().charAt(0);
                    if (select == 'y')
                        break;
                    else if (select == 'n')
                        return;
                    else
                        System.out.println("�߸��Է��ϼ̽��ϴ�.");
                }
            }
        }
	}
}
