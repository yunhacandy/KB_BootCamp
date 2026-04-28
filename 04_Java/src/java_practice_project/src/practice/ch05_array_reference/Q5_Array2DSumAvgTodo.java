package practice.ch05_array_reference;

public class Q5_Array2DSumAvgTodo {
    public static void main(String[] args) {

    int[][] array = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
    };

    // TODO 1: 전체 합을 저장할 변수 선언
        int sum = 0;

    // TODO 2: 전체 개수를 저장할 변수 선언
        int count = 0;

    // TODO 3: 바깥 for문 (행 반복)
        for(int i = 0; i<array.length; i++){
            // TODO 4: 안쪽 for문 (열 반복)
            for(int j = 0; j<array[i].length; j++){
                // TODO 5: 합 누적
                sum += array[i][j];
                // TODO 6: 개수 증가
                count++;
            }
        }

    // TODO 7: 평균 계산 (형변환 주의)
        double answer = (double) sum / count;


    // TODO 8: 결과 출력
    // 출력 형식:
    // 합: xxx
    // 평균: xxx

        System.out.println("합: "+sum);
        System.out.printf("평균: %.3f\n", answer);

}
}
