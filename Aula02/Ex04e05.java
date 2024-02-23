import java.util.Arrays;
import java.util.Random;

public class Ex04e05 {
    public static void main(String[] args) {

        int[] array = new int[20];
        int soma = 0;
        int somaPar = 0;
        int somaImpar = 0;

        Random random = new Random();
        for(int i=0; i< array.length; i++){
            array[i] = random.nextInt(101);
            soma += array[i];
            System.out.println(soma);
            if (array[i] % 2 == 0) {
                somaPar++;
            } else {
                somaImpar++;
            }
        }

        int media = soma / array.length;
        System.out.println("Array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Array Ordenado: " + Arrays.toString(array));
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Ímpares: " + somaImpar);
        System.out.println("Pares: " + somaPar);
    }
}
