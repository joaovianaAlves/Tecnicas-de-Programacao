import java.util.Scanner;

public class Exercicio03 {
    public void MediaGeometrica(){
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();
        float num4 = input.nextFloat();

        float media = (float) Math.pow(num1 * num2 * num3 * num4, (1f/4f));
        System.out.println(media);
    }
}
