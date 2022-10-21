import java.util.Scanner;

public class Name {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        greet();
        check();

    }
    static void check() {
        String viacheslav = "Вячеслав";
        String name;
        name = scanner.nextLine();
        if (name.equals(viacheslav)) {
            hello();
        } else {
            mistake();
        }
    }


    static void greet() {
        System.out.println("Enter your name:");
    }
    static void hello() {
        System.out.println("“Привет, Вячеслав”");

    }
    static void mistake() {
        System.out.println(" \"Нет такого имени\"");


}

}
