import java.util.*;
import java.io.*;

public class Lesson10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Сколько тебе лет?");
    int age = sc.nextInt();
    switch (age) {
        case 0:
            System.out.println("Ты родился");
            break;
        case 5:
            System.out.println("Тебе 5 лет");
            break;
            case 10:
                System.out.println("тебе 10 лет");
    }
    }
}
