import java.util.Scanner;
public class Menu{
    public static void main(String[] args) {
        System.out.println("Bem Vindo a sua Calculadora Pessoal!");
        int constante, variavel;
        String operacao="zzzzzzz";
        Scanner scan = new Scanner(System.in);
        System.out.println("Como usar:");
        System.out.println("1-digite seu primeiro valor");
        System.out.println("2-digite sua operação");
        System.out.println("3-repita quantas vezes quiser");
        System.out.println("4-quando quiser parar digite sinal de igual(=)");
        constante= scan.nextInt();
        while(operacao.charAt(0)!='=') {
            operacao= scan.next();
            if (operacao.charAt(0)!='=') {
                variavel= scan.nextInt();
                if (operacao.charAt(0)=='+') {
                    constante += variavel;
                }
            }
            System.out.println(constante);
        }
    }
}