import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TaskThree {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        int arrSize = 0;
        if (sc.hasNextInt()) {
            arrSize = sc.nextInt();
        }
        int[] arr = new int[arrSize];
        System.out.println("Введите массив чисел: ");
        for (int i = 0; i < arrSize; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        Arrays.stream(arr).filter(i -> i % 3 == 0).forEach(System.out::println);
		TimeUnit.SECONDS.sleep(3);
    }
}
