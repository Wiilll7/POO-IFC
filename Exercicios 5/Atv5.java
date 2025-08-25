package exercicios5;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Arrays;

public class Atv5 {
	public static void main (String[]args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Insira quantas cartelas voce deseja preencher: ");
		final int TAM = in.nextInt();
		final int TAMNUM = 6;

		boolean val = true;
		int[][] num = new int[TAM][TAMNUM];
		Random random = new Random();
		int[] res = new int[TAMNUM];
		int[] pontos = new int[TAM];
		
		System.out.println("Cada cartela sera preenchida com 6 números cada, sendo eles entre 1 e 60.");
		
		for (int i = 0; i < TAM; i++) {
			System.out.println("Cartela "+(i+1)+": ");
			for (int j = 0; j < TAMNUM; j++) {
				do {
					System.out.println("Número "+(j+1)+": ");
					
					num[i][j] = in.nextInt();
					val = true;
					
					if (j != 0) {
						for (int k = 0; k < j; k++) {
							if (num[i][j] == num[i][k]) {
								System.out.println("Número repetido, entre com outro valor.");
								val = false;
								break;
							}
						}
					}
					
					if (num[i][j] < 1 || num[i][j] > 60) {
						System.out.println("Número inserido inválido, entre com um valor entre 1 e 60.");
						val = false;
					}
					
				} while (val == false);
			}
		}
		
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAMNUM; j++) {
				for (int k = 0; k < TAMNUM; k++) {
					
					if (num[i][j] < num[i][k]) {
						int troca = num[i][j];
						num[i][j] = num[i][k];
						num[i][k] = troca;
					}
					
				}
			}
		}
		
		for (int i = 0; i < TAMNUM; i++) {
			do {
				res[i] = random.nextInt(1, 60);
				val = true;
				
				if (i != 0) {
					for (int j = 0; j < i; j++) {
						if (res[i] == res[j]) {
							val = false;
							break;
						}
					}
				}
				
			} while (val == false);
		}
		
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAMNUM; j++) {
				for (int k = 0; k < TAMNUM; k++)
					if (res[k] == num[i][j]) {
						pontos[i]++;
				}
			}
		}
		
		Arrays.sort(res);
		System.out.println("Cartelas preenchidas: ");
		
		for (int i = 0; i < TAM; i++) {
			System.out.println("Cartela "+(i+1)+": ");
			for (int j = 0; j < TAMNUM; j++) {
				System.out.print("["+num[i][j]+"] ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Cartela gabarito: ");
		for (int i = 0; i < TAMNUM; i++) {
			System.out.print("["+res[i]+"] ");
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < TAM; i++) {
			System.out.println("Pontuação na cartela "+(i+1)+": "+pontos[i]);
		}
		in.close();
		
		try {
			
			PrintWriter saida = new PrintWriter(new FileWriter("Loteria.txt"));
			
			for (int i = 0; i < TAM; i++) {
				saida.println("Cartela "+(i+1)+": ");
				for (int j = 0; j < TAMNUM; j++) {
					saida.print("["+num[i][j]+"] ");
				}
				saida.println("\n");
			}
			
			saida.println("Cartela gabarito: ");
			for (int i = 0; i < TAMNUM; i++) {
				saida.print("["+res[i]+"] ");
			}
			
			saida.println("\n");
			
			for (int i = 0; i < TAM; i++) {
				saida.println("Pontuação na cartela "+(i+1)+": "+pontos[i]);
			}
			saida.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
