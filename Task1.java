import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

 //        int b=0;
//        System.out.println(b+"=b");


        if (a==0) {
            System.out.println("zero");
        } else if (a % 2 == 0) {
            System.out.println("even");
        }else if(a%2!=1)
            System.out.println("odd");
        System.out.println("E");

        }
    }
