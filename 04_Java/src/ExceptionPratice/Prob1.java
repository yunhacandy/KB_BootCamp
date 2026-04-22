package ExceptionPratice;

import java.util.Scanner;

public class Prob1 {
    //사용자에게 보여주는 메시지
    private static final String INPUT_MESSAGE = "숫자로 입력 입력해 주세요";

    //예외 발생시 출력할 메시지
    private static final String EMPTY_INPUT_ERROR_MESSAGE = "\"예외가 발생되었습니다. 문자열을 입력하지 않고 Enter키를 누르셨습니다.\"";
    private static final String INVALID_NUMBER_ERROR_MESSAGE = "숫자로 변환 할 수 없는 문자열 입니다.";

    //필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(INPUT_MESSAGE);
        String str = scan.nextLine();   //Enter 키를 입력받기 까지 문자열 입력

        try {
            int result= convert(str);
            System.out.println("변환된 숫자는 " + result + "입니다. ");

        } catch (IllegalArgumentException e) {
            System.out.println(EMPTY_INPUT_ERROR_MESSAGE);
        } catch (Exception e1) {
            System.out.println(INVALID_NUMBER_ERROR_MESSAGE);
        }finally {
            scan.close();
        }

    }

    //필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
    private static int convert(String input) {
        if(input == null || input.isEmpty()){
            throw new IllegalArgumentException();
        }
        return Integer.parseInt(input);
    }

}
