package com.jyw.exam.board;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== �Խ��� v 0.1 ==");
		System.out.println("== ���α׷� ���� ==");
		Scanner sc = new Scanner(System.in);
		int x = 1;
		while(true) {
			String cmd = sc.nextLine();
			System.out.printf("���) %s\n", cmd);
			
			if (cmd.equals("/usr/article/write")) {
				System.out.println("�Խù� ���");
				String title = sc.nextLine();
				System.out.printf("����: %s\n", title);
				String content = sc.nextLine(); 
				System.out.printf("����: %s\n", content);
				System.out.printf("%d�� �Խù��� ��ϵǾ����ϴ�.\n",x);
				x++;
			}
			
			else if (cmd.equals("exit")) {	
				System.out.println("== ���α׷� ���� ==");
				break;
			}
		}
		sc.close();
	}

}
