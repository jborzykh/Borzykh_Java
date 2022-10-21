import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of your Array:");
        int len = scanner.nextInt();
        int[] mas = new int[len];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }


        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 3 == 0 & mas[i] != 0) {
                System.out.print(mas[i] + " ");
            }
        }
    }
}










