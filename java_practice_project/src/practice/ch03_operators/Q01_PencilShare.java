package practice.ch03_operators;

/*
문제 6. 몫과 나머지
사탕 247개를 13명에게 똑같이 나누어 줄 때,
1인당 몇 개를 받을 수 있고 몇 개가 남는지 출력하세요.

출력 예시:
1인당 사탕 수: 19
남는 사탕 수: 0
*/
public class Q01_PencilShare {
    public static void main(String[] args) {
        int candies = 247;
        int students = 13;

        // TODO: 1인당 받는 사탕 수를 계산하세요.
        int share = candies / students;
        // TODO: 남는 사탕 수를 계산하세요.
        int left = candies % students;

        // TODO: 결과를 출력하세요.
        System.out.println("1인당 사탕 수: " + share);
        System.out.println("남는 사탕 수: " + left);
    }
}
