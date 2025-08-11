package exercicios2;
import java.util.Scanner;
public class Atv15 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o preço de custo do produto: ");
		float preco = in.nextFloat();
		System.out.println("Informe o código de origem do produto: ");
		int codigo = in.nextInt();
		if (codigo == 1) {
			System.out.println("Preço: R$"+preco+"\n"+
							   "Origem: Sul");
		} else if (codigo == 2) {
			System.out.println("Preço: R$"+preco+"\n"+
							   "Origem: Norte");
		} else if (codigo == 3) {
			System.out.println("Preço: R$"+preco+"\n"+
					   		   "Origem: Leste");
		} else if (codigo == 4) {
			System.out.println("Preço: R$"+preco+"\n"+
					   		   "Origem: Oeste");
		} else if (codigo == 5 || codigo == 6) {
			System.out.println("Preço: R$"+preco+"\n"+
					   		   "Origem: Nordeste");
		} else if (codigo == 7 || codigo == 8) {
			System.out.println("Preço: R$"+preco+"\n"+
					   		   "Origem: Centro-Oeste");
		} else {
			System.out.println("Preço: R$"+preco+"\n"+
							   "Origem: Importado");
		}
		in.close();
	}
}
