import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        try {
            nameMethod();
        } catch (Exception e) {
            System.err.println("Пустые строки вводить нельзя!");
        }
    }

    public static void nameMethod() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение и нажмите ENTER");
        String input = scanner.nextLine();
        if (input.length() == 0) throw new RuntimeException();
        else{
            System.out.println(input);
        }
        scanner.close();
    }
}
