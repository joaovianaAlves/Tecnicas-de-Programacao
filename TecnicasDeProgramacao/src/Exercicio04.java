import java.util.Scanner;

public class Exercicio04 {
    public void MesAnoEm(){
        Scanner input = new Scanner(System.in);

        int ano = input.nextInt();
        int mes = input.nextInt();

        if(mes > 12 || mes < 0) {
            System.out.println("Errado");
        } else {
            int dias = 0;
            boolean bisexto = (ano % 4 == 0) && !(ano % 100 == 0);
            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12:
                    dias = 31;
                    break;
                case 2:
                    dias = bisexto ? 28 : 29;
                    break;
                case 4, 6, 9, 11:
                    dias = 30;
            }
            System.out.println(dias);
        }
    }

}
