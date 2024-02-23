import java.util.Scanner;

public class Exercicio01 {
        public void celiusToFahrenheit(){
            Scanner input = new Scanner(System.in);
            float celcius = input.nextFloat();
            float celciusToFahrenheit = celcius * 1.8f + 32;
            System.out.println(celciusToFahrenheit);
        }

}
