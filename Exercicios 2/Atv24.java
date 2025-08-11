package exercicios2;
import java.util.Scanner;
public class Atv24 {
	public static void main(String[]args) {
		 Scanner in = new Scanner(System.in);
	    System.out.println("Insira a primeira nota: ");
	    float nota1 = in.nextFloat();
	    System.out.println("Insira a segunda nota: ");
	    float nota2 = in.nextFloat();
	    System.out.println("Insira a terceira nota: ");
	    float nota3 = in.nextFloat();
	    double media = (nota1 + nota2 + nota3)/3;
	    if (media < 7) {
	      System.out.println("Reprovado");
	    } else if (media >= 7 && media < 10) {
	      System.out.println("Aprovado");
	    } else if (media == 10) {
	      System.out.println("Aprovado com distinção");
	    }
	    in.close();
	}
}
