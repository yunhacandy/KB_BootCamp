package practice.ch05_array_reference;

import java.util.Scanner;

public class Q6_StudentScoreAnalysisTodo {

    public static void main(String[] args) {
        // TODO 1: Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // TODO 2: 학생 수 변수 선언
        int studentCount = 0;

        // TODO 3: 점수 배열 선언 (아직 생성 X)
        int[] scores = null;

        // TODO 4: while(true) 반복문 작성
        while (true) {

            // TODO 5: 메뉴 출력
            // --------------------------------------
            // 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
            // --------------------------------------
            System.out.println("--------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------");

            // TODO 6: 사용자 선택 입력 받기 (nextLine 사용)
            String input = sc.nextLine();


            // TODO 7: 선택에 따른 기능 구현

            // [1] 학생 수 입력
            // - "학생수>" 출력
            // - 입력값을 정수로 변환
            // - scores 배열 생성


            // [2] 점수 입력
            // - 반복문으로 scores[i] 입력 받기


            // [3] 점수 리스트 출력
            // - scores[i]: 값 형태로 출력


            // [4] 분석
            // - 최대값 구하기
            // - 평균 구하기
            // - 출력


            // [5] 종료
            // - "프로그램 종료" 출력 후 break


            if (input.contains("1") || input.contains("학생수")) {
                System.out.print("학생수>");
                studentCount = Integer.parseInt(sc.nextLine());
                scores = new int[studentCount];

            } else if (input.contains("2") || input.contains("점수입력")) {
                if (scores == null) {
                    System.out.println("먼저 학생 수를 입력하세요.");
                    continue;
                }

                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]>");
                    scores[i] = Integer.parseInt(sc.nextLine());
                }

            } else if (input.contains("3") || input.contains("점수리스트")) {
                if (scores == null) {
                    System.out.println("먼저 점수를 입력하세요.");
                    continue;
                }

                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "]: " + scores[i]);
                }

            } else if (input.contains("4") || input.contains("분석")) {
                if (scores == null) {
                    System.out.println("먼저 점수를 입력하세요.");
                    continue;
                }

                int max = scores[0];
                int sum = 0;

                for (int i = 0; i < scores.length; i++) {
                    if (scores[i] > max) {
                        max = scores[i];
                    }
                    sum += scores[i];
                }

                double avg = (double) sum / scores.length;

                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);

            } else {
                System.out.println("프로그램 종료");
                break;

            }
        }

        // TODO 8: Scanner 닫기
        sc.close();
    }
}