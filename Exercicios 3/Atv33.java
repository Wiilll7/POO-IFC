package exercicios3;
import java.util.Scanner;
public class Atv33 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira o valor da divida: ");
		float divida = in.nextFloat();
		System.out.println("Insira a quantia de parcelas: ");
		int parcela = in.nextInt();
		float valorJuros = 0;
		float valorParcela = 0;
		if (parcela < 3) {
			valorParcela = divida / parcela;
		} else if (parcela < 6) {
			valorJuros = divida * 0.10f;
			divida = divida + valorJuros;
			valorParcela = divida / parcela;
		} else if (parcela < 9) {
			valorJuros = divida*0.15f;
			divida = divida + valorJuros;
			valorParcela = divida / parcela;
		} else if (parcela < 12) {
			valorJuros = divida*0.20f;
			divida = divida + valorJuros;
			valorParcela = divida / parcela;
		} else {
			valorJuros = divida*0.25f;
			divida = divida + valorJuros;
			valorParcela = divida / parcela;
		}
		System.out.println( "Valor da divida: "+divida+"\n"+
							"Valor do juros: "+valorJuros+"\n"+
							"Quantidade de parcelas: "+parcela+"\n"+
							"Valor da parcela: "+valorParcela);
		in.close();
	}
}
