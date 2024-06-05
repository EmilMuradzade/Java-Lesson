import java.util.Scanner;

public class TaskFor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Müsbet tam eded daxil edin");
        int a = sc.nextInt();
        if (a > 0 && a % 1 == 0) {
            for (int i = 1; i < 10; i++) {
                System.out.println(a + "*" + i + "=" + (a * i));

            }
        }

    }
}
