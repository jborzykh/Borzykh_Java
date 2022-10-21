import java.util.Scanner;

public class Number {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        greet();
        check();

    }
static void check() {
        int number;
        number = scanner.nextInt();
            if (number >7 ) {
                hello();
            }
      }


    static void greet() {
        System.out.println("Enter your number:");
    }
    static void hello() {
        System.out.println("“Привет”");

    }


}

