import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
       // int c = scan.nextInt();
        while (a < b) {
            if (a % 2 == 1)
                System.out.println(a);
            a++;
        }
    }
}