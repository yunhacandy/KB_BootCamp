package ch06;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    // 1. 문자열 입력
    public static String read(String title) {
        System.out.print(title + ": ");
        return scanner.nextLine();
    }

    // 2. 문자열 입력 (기본값)
    public static String read(String title, String defaultValue) {
        System.out.print(title + " (" + defaultValue + "): ");
        String input = scanner.nextLine();
        return input.isEmpty() ? defaultValue : input;
    }

    // 3. 정수 입력
    public static int readInt(String title) {
        System.out.print(title + ": ");
        return Integer.parseInt(scanner.nextLine());
    }

    // 4. confirm (기본값 포함)
    public static boolean confirm(String title, boolean defaultValue) {
        if (defaultValue) {
            System.out.print(title + "? (Y/n): ");
        } else {
            System.out.print(title + "? (Y/n): ");
        }

        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            return defaultValue;
        }

        return input.equalsIgnoreCase("y");
    }

    // 5. confirm (기본값 true)
    public static boolean confirm(String title) {
        return confirm(title, true);
    }
}