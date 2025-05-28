package 반복문;

import java.util.Scanner;

public class while반복문2 {
	 public static void main(String[] args) {
	       	Scanner s = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("1. 게임 시작");
	            System.out.println("2. 설정");
	            System.out.println("3. 종료");
	            System.out.print("메뉴 선택: ");
	            choice = s.nextInt();
	        } while (choice != 3);

	        System.out.println("프로그램 종료!");
	    }
	}
