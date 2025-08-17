package exercicios3;
import java.util.Scanner;
public class Atv35 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int i = 1;
		int quantidade;
		float valorTotal = 0;
		do {
			System.out.println("Especificação    Código    Preço\n"+
							   "Cachorro Quente  100       R$ 1,20\n"+
							   "Bauru Simples    101       R$ 1,30\n"+
							   "Bauru com ovo    102       R$ 1,50\n"+
							   "Hambúrguer       103       R$ 1,20\n"+
							   "Cheeseburguer    104       R$ 1,30\n"+
							   "Refrigerante     105       R$ 1,00");
			int select = in.nextInt();
			switch (select) {
			case 100: 
				System.out.println("Insira a quantidade: ");
				quantidade = in.nextInt();
				System.out.println("Valor a ser pago: R$"+quantidade * 1.20f);
				valorTotal += quantidade * 1.20f;
				break;
			case 101:
				System.out.println("Insira a quantidade: ");
				quantidade = in.nextInt();
				System.out.println("Valor a ser pago: R$"+quantidade * 1.30f);
				valorTotal += quantidade * 1.30f;
				break;
			case 102:
				System.out.println("Insira a quantidade: ");
				quantidade = in.nextInt();
				System.out.println("Valor a ser pago: R$"+quantidade * 1.50f);
				valorTotal += quantidade * 1.50f;
				break;
			case 103:
				System.out.println("Insira a quantidade: ");
				quantidade = in.nextInt();
				System.out.println("Valor a ser pago: R$"+quantidade * 1.20f);
				valorTotal += quantidade * 1.20f;
				break;
			case 104:
				System.out.println("Insira a quantidade: ");
				quantidade = in.nextInt();
				System.out.println("Valor a ser pago: R$"+quantidade * 1.30f);
				valorTotal += quantidade * 1.30f;
				break;
			case 105:
				System.out.println("Insira a quantidade: ");
				quantidade = in.nextInt();
				System.out.println("Valor a ser pago: R$"+quantidade);
				valorTotal += quantidade;
				break;
			}
			System.out.println( "Deseja acrescentar mais um item? \n"+
								"1. Sim \n"+
								"2. Não");
			i = in.nextInt();
		} while (i == 1);
		System.out.println("Valor total da compra: "+valorTotal);
		in.close();
	}
}
