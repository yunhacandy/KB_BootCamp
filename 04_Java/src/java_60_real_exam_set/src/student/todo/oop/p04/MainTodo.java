package java_60_real_exam_set.src.student.todo.oop.p04;

class PrinterTodo {
    // TODO 1: println(int value)
    void println(int value){
        System.out.println(value);
    }
    // TODO 2: println(boolean value)
    void println(boolean value){
        System.out.println(value);
    }

    // TODO 3: println(double value)
    void println(double value){
        System.out.println(value);
    }

    // TODO 4: println(String value)
    void  println(String value){
        System.out.println(value);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: PrinterTodo 객체 생성 후 네 메소드 호출
        PrinterTodo printer = new PrinterTodo();

        printer.println(1);
        printer.println(true);
        printer.println(1.0);
        printer.println("one");
    }
}
