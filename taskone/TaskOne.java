import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TaskOne {
    public static void main(String[] args)  throws InterruptedException {
        System.out.println("Введите число");
        int num = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            num =sc.nextInt();
        }
        if (num>7) {
            System.out.print("Привет");
        }
		TimeUnit.SECONDS.sleep(3);
    }
}