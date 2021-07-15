import java.util.Scanner;
import java.lang.Math;
public class Menu{
    public static void main(String[] args) {
        System.out.println("Bem Vindo a sua Calculadora Pessoal!");
        double constante, variavel;
        String operacao="9999999";
        Scanner scan = new Scanner(System.in);
        System.out.println("Como usar:");
        System.out.println("1-Digite seu primeiro valor");
        System.out.println("2-Digite sua operacao");
        System.out.println("3-Repita quantas vezes quiser");
        System.out.println("4-Quando quiser parar digite sinal de igual(=)");
        constante= scan.nextInt();
        while(operacao.charAt(0)!='=') {
            operacao= scan.next();
            if (operacao.charAt(0)!='=') {
               
                if (operacao.charAt(0)=='+') {
                	 variavel= scan.nextInt();
                    constante += variavel;
                } else if (operacao.charAt(0)=='-') {
                	 variavel= scan.nextInt();
                	constante -= variavel;
                } else if (operacao.charAt(0)=='*') {
                	 variavel= scan.nextInt();
                	constante *= variavel;
                } else if (operacao.charAt(0)=='/') {
                	 variavel= scan.nextInt();
                	constante /= variavel;
                } else if (operacao.charAt(0)== '^') {
                	constante *= constante;
                } else if (operacao.charAt(0)== 'v' ) {
                	constante = Math.sqrt(constante);
                } else if(operacao.charAt(0)== 'c' && operacao.charAt(1)== 'o' && operacao.charAt(2)== 's') {
                	constante = Math.cos(constante);
                } else if(operacao.charAt(0)== 's' && operacao.charAt(1)== 'e' && operacao.charAt(2)== 'n') {
                	constante = Math.sin(constante);
                } else if(operacao.charAt(0)== 't' && operacao.charAt(1)== 'a' && operacao.charAt(2)== 'n') {
                	constante = Math.tan(constante);
                } else if(operacao.charAt(0)== 'l' && operacao.charAt(1)== 'o' && operacao.charAt(2)== 'g') {
                	constante = Math.log(constante);
                } else if(operacao.charAt(0)== 'm' && operacao.charAt(1)== 'o' && operacao.charAt(2)== 'd') {
                	constante = Math.abs(constante); 
                }	
                		else 
                	{			
                	System.out.println("Simbolo de operacao invalido, digite novamente o sinal");
            }	            
            System.out.println(constante);
           
        }
    }
}
}
