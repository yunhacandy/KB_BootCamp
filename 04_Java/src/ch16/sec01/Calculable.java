package ch16.sec01;

@FunctionalInterface
//인터페이스가 함수형 인터페이스임을 보장
//컴파일 과정에서 추상 메소드가 하나인지 검사
public interface Calculable {
    void calculate(int x, int y);
}
