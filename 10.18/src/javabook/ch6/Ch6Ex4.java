package javabook.ch6;

import java.util.Scanner;

public class Ch6Ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ȯ�溯�� PATH: " + System.getenv("PATH"));
		
		System.setProperty("user", "ȫ�浿");
		System.out.println("user �Ӽ���: " + System.getProperty("user"));
		
		System.out.println("�����Ϸ��� x�� ��������!!");
		while(true){
			if(scanner.next().equals("x")){
				System.out.println("���α׷� ������!!");
				System.exit(0);
			}
			else
				System.out.println("�ٽ� �Է��ϼ���!!");
		}
	}
}