package exercicios5;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Atv2 {
	public static void main (String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		final int TAM = 5;
		float[][] matriz = new float[TAM][TAM];
		float[] medProduto = new float[TAM];
		float[] soma = new float[TAM];
		int caro = 0;
		int baixo = 0;
		
		for (int linha = 0; linha < TAM; linha++) {
			soma[linha] = 0;
			for (int coluna = 0; coluna < TAM; coluna++) {
				System.out.println("Entre com: Mercado "+(linha+1)+", preço do produto "+(coluna+1)+": ");
				matriz[linha][coluna] = in.nextFloat();
				soma[linha] += matriz[linha][coluna];
				medProduto[coluna] += matriz[linha][coluna];
			}
			if (soma[linha] > soma[caro]) {
				caro = linha;
			} else if (soma[linha] < baixo) {
				baixo = linha;
			}
		}
		
		for (int linha = 0; linha < TAM; linha++) {
			for (int coluna = 0; coluna < TAM; coluna++) {
				System.out.println("Mercado "+(linha+1)+", preço do produto "+(coluna+1)+": "+matriz[linha][coluna]);
			}
			System.out.println("Soma de preços do mercado "+(linha+1)+": "+soma[linha]);
		}
		
		for (int i = 0; i < TAM; i++) {
			medProduto[i] = medProduto[i] / TAM;
			System.out.println("Média de preço do produto "+(i+1)+": "+medProduto[i]);
		}
		
		System.out.println( "Valor no mercado mais caro: "+soma[caro]+"\n"+
							"Valor no mercado mais barato: "+soma[baixo]);
		in.close();
		
		try {
			
			PrintWriter saida = new PrintWriter(new FileWriter("mercado.txt"));
			
			for (int linha = 0; linha < TAM; linha++) {
				for (int coluna = 0; coluna < TAM; coluna++) {
					saida.println("Mercado "+(linha+1)+", preço do produto "+(coluna+1)+": "+matriz[linha][coluna]);
				}
				saida.println("Soma de preços do mercado "+(linha+1)+": "+soma[linha]);
			}
			
			for (int i = 0; i < TAM; i++) {
				saida.println("Média de preço do produto "+(i+1)+": "+medProduto[i]);
			}
			
			saida.println( "Valor no mercado mais caro: "+soma[caro]+"\n"+
					"Valor no mercado mais barato: "+soma[baixo]);
			saida.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
