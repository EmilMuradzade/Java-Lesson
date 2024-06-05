public class TaskFor2 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 3; i++) {
            a = a + i;
            System.out.println(a + "+" + i + "=" + (a + i));
        }
        System.out.println(a);
    }
}