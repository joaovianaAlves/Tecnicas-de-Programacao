import java.io.Console;
import java.util.Scanner;

public class Ex03 {
    static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.println(fibo(i));
        }
    }
}
