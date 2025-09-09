package exercicios6.Atv5;
import java.util.Scanner;

public class CardapioMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Cardapio cardapio = new Cardapio();
		
		float valorTotal = 0;
		int x = 0;
		int codigo;
		int qnt;
		
		System.out.println("Especificação   Código Preço\r\n"
						 + "Cachorro Quente 100    R$ 1,20\r\n"
						 + "Bauru Simples   101    R$ 1,30\r\n"
						 + "Bauru com ovo   102    R$ 1,50\r\n"
						 + "Hambúrguer      103    R$ 1,20\r\n"
						 + "Cheeseburguer   104    R$ 1,30\r\n"
						 + "Refrigerante    105    R$ 1,00");
		
		do {
			boolean val = true;
			
			do {
				System.out.println("Insira o codigo do item que voce deseja comprar: ");
				codigo = in.nextInt();
				
				if (codigo != 100 && codigo != 101 && codigo != 102 && codigo != 103 && codigo != 104 && codigo != 105) {
					val = false;
					System.out.println("Codigo incorreto. Insira novamente.");
				} else {
					val = true;
				}
			} while (val == false);
			
			do {
				System.out.println("Insira a quantidade que você deseja adiquirir: ");
				qnt = in.nextInt();
				
				if (qnt < 1) {
					val = false;
					System.out.println("Valor incorreto, selecione um ou mais quantidades.");
				} else {
					val = true;
				}
			} while (val == false);
			
			cardapio.setCodigo(codigo);
			cardapio.setQnt(qnt);
			valorTotal += cardapio.valor();
			System.out.println(cardapio);
			System.out.println("Quer adicionar mais itens ao carrinho? \n"
							 + "1. Sim \n"
							 + "2. Não");
			x = in.nextInt();
		} while (x == 1);
		
		System.out.println("Valor final do pedido: R$"+valorTotal);
		
		in.close();
	}

}
