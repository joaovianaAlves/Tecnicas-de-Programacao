//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex01 {
    public static void main(String[] args) {
        int soma = 1;
        for(int i = 1; i <= 15; i++){
            int resultado = (soma * soma) + 1;
            System.out.println(resultado);
            soma++;
        }
    }
}