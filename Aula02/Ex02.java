import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        int soma = 0;

        for(int i = 1; i <= num - 1; i ++){
            if (num % i == 0) {
                soma += i;
                System.out.println(soma);
            }
        }

        System.out.println((soma == num)? "e perfeito" : "não e perfeito");

    }
}
