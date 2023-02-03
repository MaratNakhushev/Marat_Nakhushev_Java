import java.util.Scanner;

public class Second_task {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите имя:");
            String Name = in.next();
            String Vechaslav = "Вечеслав";
            if (Name == Vechaslav) {
                System.out.print("Привет Вечеслав");
            } else {
                System.out.print("Нет такого имени");
            }

        }
    }
