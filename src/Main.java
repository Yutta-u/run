import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("enter your number: ");

        Scanner scan = new Scanner(System.in);

        int a = 1;

        int num = scan.nextInt();

        int x = a + num;

        System.out.println(x);

        System.out.println(x * num);

    }
}
