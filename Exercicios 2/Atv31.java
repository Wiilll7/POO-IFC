package exercicios2;
import java.util.Scanner;
public class Atv31 {
	public static void main (String[]args) {
	    Scanner in = new Scanner(System.in);
	    double valorMorango;
	    double valorMaca;
	    double valorTotal;
	    System.out.println("Quantos kg você vai comprar de morango ?");
	    float morango = in.nextFloat();
	    System.out.println("Quantos kg você vai comprar de maçã? ");
	    float maca = in.nextFloat();
	    float pesoTotal = morango + maca;
	    if (morango <= 5) {
	      valorMorango = morango * 2.50;
	    } else {
	      valorMorango = morango * 2.20;
	    }
	    if (maca <= 5){
	      valorMaca = maca * 1.80;
	    } else{
	      valorMaca = maca * 1.50;
	    }
	    valorTotal = valorMorango + valorMaca;
	    if ((pesoTotal > 8) || (valorTotal > 25)) {
	      valorTotal = valorTotal * 0.90;
	    }
	    System.out.println("O valor total a ser pago é: R$"+valorTotal);
	    in.close();
	}
}
