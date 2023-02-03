import java.io.InputStream;
import java.util.Scanner;

public class first_task {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число:");
            int num = in.nextInt();
            if (num > 7) {
                System.out.print("Привет");
            } else {
                System.out.print("Не Привет");
            }

        } catch (Exception e) {
            System.out.print("Это не число!");
        }

    }
}

