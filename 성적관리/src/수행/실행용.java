package 수행;

import java.util.*;

public class 실행용 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n[1] 학생 추가  [2] 전체 출력  [3] 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("이름: ");
                String name = scanner.nextLine();
                System.out.print("국어 점수: ");
                int kor = scanner.nextInt();
                System.out.print("영어 점수: ");
                int eng = scanner.nextInt();
                System.out.print("수학 점수: ");
                int math = scanner.nextInt();
                scanner.nextLine();

                students.add(new Student(name, kor, eng, math));
                System.out.println("학생 정보가 추가되었습니다.");

            } else if (choice == 2) {
                System.out.println("\n이름\t국어\t영어\t수학\t총점\t평균\t학점");
                for (Student s : students) {
                    System.out.println(s);
                }

            } else if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        scanner.close();
    }
}