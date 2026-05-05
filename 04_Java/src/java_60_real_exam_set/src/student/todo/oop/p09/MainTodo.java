package java_60_real_exam_set.src.student.todo.oop.p09;

import java.util.Scanner;

class ScoreManagerTodo {
    int[] scores;

    // TODO 1: setStudentCount(int count)
    void setStudentCount(int count) {
        scores = new int[count];
    }

    // TODO 2: inputScores(Scanner sc)
    void inputScores(Scanner sc) {
        for (int i = 0; i < scores.length; i++) {
            System.out.print("scores[" + i + "]> ");
            scores[i] = sc.nextInt();
        }
    }

    // TODO 3: printScores()
    void printScores() {
        for (int score : scores) {
            System.out.println(score);
        }
    }

    // TODO 4: analyze()
    void analyze() {
        int max = scores[0];
        int sum = 0;

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            sum += score;
        }

        double avg = (double) sum / scores.length;

        System.out.println("최고 점수: " + max);
        System.out.println("평균 점수: " + avg);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: ScoreManagerTodo와 Scanner를 이용한 메뉴형 프로그램 작성
        Scanner sc = new Scanner(System.in);

        ScoreManagerTodo sm = new ScoreManagerTodo();

        while (true) {
            System.out.println("------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수출력 | 4.분석 | 5.종료");
            System.out.println("------------------------------------");
            System.out.print("선택 > ");

            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.print("학생수 > ");
                int count = sc.nextInt();
                sm.setStudentCount(count);
            } else if (menu == 2) {
                sm.inputScores(sc);
            } else if (menu == 3) {
                sm.printScores();
            } else if (menu == 4) {
                sm.analyze();
            } else if (menu == 5) {
                break;
            }
        }
        sc.close();
    }
}
