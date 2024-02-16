import java.util.Scanner;

public class Exercicio02 {
    public void MediaAritimetica(){
        Scanner input = new Scanner(System.in);
        float num1 = input.nextInt();
        float num2 = input.nextInt();
        float num3 = input.nextInt();
        float num4 = input.nextInt();
        float media = num1 + num2 + num3 + num4 / 4;

        String result = media < 6 ? "Reprovado" : "Aprovado";
        System.out.println(result);
    }
}
