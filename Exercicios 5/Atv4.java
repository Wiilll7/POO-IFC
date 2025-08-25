package exercicios5;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Atv4 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de atletas que vão participar: ");
		final int TAM = in.nextInt();
		
		float[][] salto = new float[TAM][5];
		float[] media = new float[TAM];
		float medTemp;
		int medC = 0;
		int medP = 0;
		
		for (int i = 0; i < TAM; i++) {
			medTemp = 0;
			
			for (int j = 0; j < 5; j++) {
				System.out.println("Atleta "+(i+1)+", salto "+(j+1)+": ");
				salto[i][j] = in.nextFloat();
				medTemp += salto[i][j];
				System.out.println("Sua média por enquanto é: "+(medTemp / (j+1))+"\n");
				media[i] += salto[i][j];
			}
			
			media[i] = media[i] / 5;
			
			if (media[i] > media[medC]) {
				medC = i;
			} else if (media[i] < media[medP]) {
				medP = i;
			}
		}
		
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Atleta "+(i+1)+", salto número "+(j+1)+": "+salto[i][j]);
			}
			System.out.println("Sua média dos saltos foi de: "+media[i]+"\n");
		}
		
		System.out.println(   "A média do campeão foi de: "+media[medC]+"\n"
							+ "A média do ultimo lugar foi de: "+media[medP]);
		in.close();
		
		try {
			
			PrintWriter saida = new PrintWriter(new FileWriter("Saltos.txt"));
			for (int i = 0; i < TAM; i++) {
				for (int j = 0; j < 5; j++) {
					saida.println("Atleta "+(i+1)+", salto número "+(j+1)+": "+salto[i][j]);
				}
				saida.println("Sua média dos saltos foi de: "+media[i]+"\n");
			}
			
			saida.println("A média do campeão foi de: "+media[medC]+"\n"
						+ "A média do ultimo lugar foi de: "+media[medP]);
			saida.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
