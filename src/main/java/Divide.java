import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the length of your Array:");
            int len = scanner.nextInt();
            if (len == 0) {
                System.out.println("Array can not be zero!");
            }
            if (len != 0 ) {

                int[] mas = new int[len];
                System.out.println("Enter the numbers:");
                for (int i = 0; i < mas.length; i++) {

                    mas[i] = scanner.nextInt();
                }


                for (int i = 0; i < mas.length; i++) {
                    if (mas[i] % 3 == 0 & mas[i] != 0) {
                        System.out.print(mas[i] + " ");
                    }
                }
            }

        } catch (NegativeArraySizeException var8) {
            System.out.println("Seriously? Why so negative?");
        }
    }
}










