package com.jyw.exam.board;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 게시판 v 0.1 ==");
		System.out.println("== 프로그램 시작 ==");
		Scanner sc = new Scanner(System.in);
		int x = 1;
		while(true) {
			String cmd = sc.nextLine();
			System.out.printf("명령) %s\n", cmd);
			
			if (cmd.equals("/usr/article/write")) {
				System.out.println("게시물 등록");
				String title = sc.nextLine();
				System.out.printf("제목: %s\n", title);
				String content = sc.nextLine(); 
				System.out.printf("내용: %s\n", content);
				System.out.printf("%d번 게시물이 등록되었습니다.\n",x);
				x++;
			}
			
			else if (cmd.equals("exit")) {	
				System.out.println("== 프로그램 종료 ==");
				break;
			}
		}
		sc.close();
	}

}
