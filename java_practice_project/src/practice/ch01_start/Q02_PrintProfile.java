package practice.ch01_start;

import java.sql.SQLOutput;

/*
문제 2. 여러 줄 출력
다음과 같이 3줄이 출력되도록 코드를 작성하세요.
출력 결과:
이름: 홍길동
직업: 개발자 준비생
목표: Java 기초 완성
*/
public class Q02_PrintProfile {
    public static void main(String[] args) {
        // TODO: println()을 이용해 3줄을 출력하세요.
        System.out.println("이름: 홍길동");
        System.out.println("직업: 개발자 준비생");
        System.out.println("목표: Java 기초 완성");
        // 이 방식도 가능System.out.print("이름: 홍길동" + '\n' + "직업: 개발자 준비생" + '\n' + "목표: Java 기초 완성");
    }
}
