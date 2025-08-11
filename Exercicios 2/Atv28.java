package exercicios2;
import java.util.Scanner;
public class Atv28 {
	public static void main (String[]args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Insira um numero: ");
	    float num1 = in.nextFloat();
	    System.out.println("Insira outro numero: ");
	    float num2 = in.nextFloat();
	    System.out.println("Escolha a operação que deseja realizar: \n"+
	                       "1. Soma \n"+
	                       "2. Subtração \n"+
	                       "3. Multiplicação \n"+
	                       "4. Divisão");
	    int escolha = in.nextInt();
	    switch (escolha) {
	      case 1:
	        double soma = num1 + num2;
	        System.out.println("A soma é: "+soma);
	        if ((soma % 2) == 0) {
	          System.out.println("É par.");
	        } else {
	          System.out.println("É impar.");
	        }
	        if (soma > 0) {
	          System.out.println("É positivo.");
	        } else {
	          System.out.println("É negativo.");
	        }
	        if ((Math.round(soma)) == soma) {
	          System.out.println("É inteiro.");
	        } else {
	          System.out.println("É decimal.");
	        }
	        break;
	      case 2:
	        double sub = num1 - num2;
	        System.out.println("A subtração é: "+sub);
	        if ((sub % 2) == 0) {
	          System.out.println("É par.");
	        } else {
	          System.out.println("É impar.");
	        }
	        if (sub > 0) {
	          System.out.println("É positivo.");
	        } else {
	          System.out.println("É negativo.");
	        }
	        if ((Math.round(sub)) == sub) {
	          System.out.println("É inteiro.");
	        } else {
	          System.out.println("É decimal.");
	        }
	        break;
	      case 3:
	        double mul = num1 * num2;
	        System.out.println("A multiplicação é: "+mul);
	        if ((mul % 2) == 0) {
	          System.out.println("É par.");
	        } else {
	          System.out.println("É impar.");
	        }
	        if (mul > 0) {
	          System.out.println("É positivo.");
	        } else {
	          System.out.println("É negativo.");
	        }
	        if ((Math.round(mul)) == mul) {
	          System.out.println("É inteiro.");
	        } else {
	          System.out.println("É decimal.");
	        }
	        break;
	      case 4:
	        double div = num1 / num2;
	        System.out.println("A divisão é: "+div);
	        if ((div % 2) == 0) {
	          System.out.println("É par.");
	        } else {
	          System.out.println("É impar.");
	        }
	        if (div > 0) {
	          System.out.println("É positivo.");
	        } else {
	          System.out.println("É negativo.");
	        }
	        if ((Math.round(div)) == div) {
	          System.out.println("É inteiro.");
	        } else {
	          System.out.println("É decimal.");
	        }
	        break;
	      default:
	        System.out.println("Opção inválida.");
	        break;
	    }
	    in.close();
	}
}
