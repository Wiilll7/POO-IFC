package exercicios5;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Atv1 {
	public static void main (String[]args) {
		
		Scanner in  = new Scanner(System.in);
		int tam = 0;
		
		do {
		System.out.println("Entre com um valor entre 3 e 11 para o tamanho da matriz: ");
		tam = in.nextInt();
		} while (tam < 3 || tam > 11);
		
		int[][] matriz = new int[tam][tam];
		
		for (int linha = 0; linha < tam; linha++) {
			for (int coluna = 0; coluna < tam; coluna++) {
				System.out.println("Insira o valor para alocar na linha "+(linha+1)+", coluna "+(coluna+1)+": ");
				matriz[linha][coluna] = in.nextInt();
			}
		}
		
		int somaElementos = 0;
		float medElementos = 0;
		int maior = 0;
		int menor = 0;
		int contP = 0;
		int contI = 0;
		int somaDiagonalP = 0;
		int somaDiagonalS = 0;
		
		for (int linha = 0; linha < tam; linha++) {
			for (int coluna = 0; coluna < tam; coluna++) {
				
				somaElementos += matriz[linha][coluna];
				medElementos += matriz[linha][coluna];
				
				if (linha == 0 && coluna == 0) {
					maior = matriz[linha][coluna];
					menor = matriz[linha][coluna];
				} else if (matriz[linha][coluna] < menor) {
					menor = matriz[linha][coluna];
				} else if (matriz[linha][coluna] > maior) {
					maior = matriz[linha][coluna];
				}
				
				if (matriz[linha][coluna] % 2 == 0) {
					contP++;
				} else {
					contI++;
				}
				
				if (linha == coluna) {
					somaDiagonalP += matriz[linha][coluna];
				}
				
				System.out.print("["+matriz[linha][coluna]+"] ");

			}
			System.out.println(" ");
		}
		
		for (int i = 0; i < tam; i++) {
			somaDiagonalS += matriz[i][tam - 1 - i];
		}
		
		medElementos = medElementos / (tam * tam);
		
		System.out.println( "Soma dos elementos: "+somaElementos+"\n"+
							"Média dos elementos: "+medElementos+"\n"+
							"Maior valor: "+maior+"\n"+
							"Menor valor: "+menor+"\n"+
							"Contador de pares: "+contP+"\n"+
							"Contador de ímpares: "+contI+"\n"+
							"Soma da diagonal principal: "+somaDiagonalP+"\n"+
							"Soma da diagonal secundária: "+somaDiagonalS);
		in.close();
		
		try {
			PrintWriter saida = new PrintWriter(new FileWriter("SaidaMatriz.txt"));
			for (int linha = 0; linha < tam; linha++) {
				for (int coluna = 0; coluna < tam; coluna++) {
					saida.print("["+matriz[linha][coluna]+"] ");
				}
				saida.println(" ");
			 }
			saida.println( "Soma dos elementos: "+somaElementos+"\n"+
					"Média dos elementos: "+medElementos+"\n"+
					"Maior valor: "+maior+"\n"+
					"Menor valor: "+menor+"\n"+
					"Contador de pares: "+contP+"\n"+
					"Contador de ímpares: "+contI+"\n"+
					"Soma da diagonal principal: "+somaDiagonalP+"\n"+
					"Soma da diagonal secundária: "+somaDiagonalS);
			saida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
