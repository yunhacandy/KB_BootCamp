package practice.ch04_control;

// 파일명: MultipleOfThreeSum.java

public class Q05_MultipleOfThreeSum {

    public static void main(String[] args) {

        // TODO 1: 총합을 저장할 변수 선언
        int sum = 0;


        // TODO 2: 1부터 100까지 반복하는 for문 작성
        for(int i = 1; i<=100; i++) {

            // TODO 3: 3의 배수인지 조건문 작성
            if (i % 3 == 0) {
                // TODO 4: 총합에 값을 누적
                sum += i;
            }
        }
        // TODO 5: 결과 출력
        System.out.println(sum);

    }
}