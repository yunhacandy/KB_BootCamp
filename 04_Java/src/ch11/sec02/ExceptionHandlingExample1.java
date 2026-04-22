package ch11.sec02;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자수: " + result);
		//data가 null일 경우 NPE 발생
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null); //매개값으로 null 대입
		System.out.println("[프로그램 종료]");
	}
}


