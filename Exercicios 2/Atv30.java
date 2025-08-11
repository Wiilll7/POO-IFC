package exercicios2;
import java.util.Scanner;
public class Atv30 {
	public static void main(String[]args) {
	    Scanner in = new Scanner(System.in);
	    double valor;
	    System.out.println("Com qual tipo de combustível você deseja abastecer?\n"+
	                       "G - Gasolina \n"+
	                       "A - Álcool");
	    char tipo = in.nextLine().charAt(0);
	    System.out.println("Insira o tanto de combustível que você deseja colocar: ");
	    float litros = in.nextFloat();
	    if (tipo == 'G' || tipo == 'g') {
	      if (litros <= 20){
	        valor = (2.5 * litros) * 0.96;
	      } else {
	        valor = (2.5 * litros) * 0.94;
	      }
	      System.out.println("Valor a pagar: "+valor);
	    }else if (tipo == 'A' || tipo == 'a') {
	      if (litros <= 20) {
	        valor = (1.9 * litros) * 0.97;
	      } else {
	        valor = (1.9 * litros) * 0.95;
	      }
	      System.out.println("Valor a pagar: "+valor);
	    } else {
	      System.out.println("Tipo de combustível inválido.");
	    }
	    in.close();
	}
}
