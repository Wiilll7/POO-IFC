package exercicios2;
import java.util.Scanner;
public class Atv32 {
	public static void main (String[]args) {
	    Scanner in = new Scanner(System.in);
	    double valor = 0;
	    double desconto = 0;
	    String tipo = " ";
	    String tipoPagamento = " ";
	    double valorF = 0;
	    System.out.println("Informe qual tipo de carne você quer comprar: \n"+
	                       "1. File Duplo \n"+
	                       "2. Alcatra \n"+
	                       "3. Picanha");
	    int escolha = in.nextInt();
	    System.out.println("Quantos kg você quer comprar: ");
	    float kg = in.nextFloat();
	    switch (escolha){
	      case 1:
	        if (kg <= 5){
	          valor = kg * 4.9;
	        } else {
	          valor = kg * 5.8;
	        }
	        tipo = "File Duplo";
	        break;
	      case 2:
	        if (kg <= 5) {
	          valor = kg * 5.9;
	        } else {
	          valor = kg * 6.8;
	        }
	        tipo = "Alcatra";
	        break;
	      case 3:
	        if (kg <= 5) {
	          valor = kg * 6.9;
	        } else {
	          valor = kg * 7.8;
	        }
	        tipo = "Picanha";
	        break;
	    }
	    System.out.println("Qual o tipo do pagamento? \n"+
	                       "1. Cartão \n"+
	                       "2. Dinheiro");
	    int pagamento = in.nextInt();
	    if (pagamento == 1) {
	      desconto = valor * 0.05;
	      valorF = valor - desconto;
	      tipoPagamento = "Cartão";
	    } else {
	      tipoPagamento = "Dinheiro";
	    }
	    System.out.println("Tipo de carne: "+tipo+"\n"+
	                       "Quantidade de carne: "+kg+"\n"+
	                       "Preço total: R$"+valor+"\n"+
	                       "Tipo de pagamento: "+tipoPagamento+"\n"+
	                       "Valor do desconto: "+desconto+"\n"+
	                       "Valor a pagar: "+valorF);
	    in.close();
	}
}
