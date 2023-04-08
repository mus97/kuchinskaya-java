import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TaskTwo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Введите ваше имя");
        String name = null;
        Scanner sc = new Scanner(System.in, "CP866");
        if (sc.hasNext()) {
            name =sc.next();
        }
        if (name.equals("Вячеслав")) {
            System.out.print("Привет, Вячеслав");
        }
        else System.out.println("Нет такого имени");
		TimeUnit.SECONDS.sleep(3);
    }
}
