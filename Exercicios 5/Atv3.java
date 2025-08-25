package exercicios5;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Atv3 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o número de alunos na escola: ");
		final int TAM = in.nextInt();
		in.nextLine();
		
		String[] nome = new String[TAM];
		float[][] nota = new float[TAM][2];
		float[] media = new float[TAM];
		int Lmaior = 0;
		int Cmaior = 0;
		int Lmenor = 0;
		int Cmenor = 0;
		int maiorMed = 0;
		int menorMed = 0;
		float medGeral = 0;
		
		for (int linha = 0; linha < TAM; linha++) {
			System.out.println("Insira o nome do aluno "+(linha+1)+": ");
			nome[linha] = in.nextLine();
			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.println("Entre com a nota "+(coluna+1)+": ");
				nota[linha][coluna] = in.nextFloat();
				media[linha] += nota[linha][coluna];
				medGeral += nota[linha][coluna];
				if (nota[linha][coluna] > nota[Lmaior][Cmaior]) {
					Lmaior = linha;
					Cmaior = coluna;
				} else if (nota[linha][coluna] < nota[Lmenor][Cmenor]) {
					Lmenor = linha;
					Cmenor = coluna;
				}
			}
			in.nextLine();
			media[linha] = media[linha] / 2;
			if (media[linha] > media[maiorMed]) {
				maiorMed = linha;
			} else if (media[linha] < media[menorMed]) {
				menorMed = linha;
			}
		}
		
		medGeral = medGeral / (TAM * 2);
		
		for (int linha = 0; linha < TAM; linha++) {
			System.out.println("Aluno: "+nome[linha]);
			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.println("nota "+(coluna+1)+": "+nota[linha][coluna]);
			}
			System.out.println("Média: "+media[linha]+"\n");
		}
		
		System.out.println("Maior nota: \n"
						 + "Nome: "+nome[Lmaior]+"\n"
						 + "Nota: "+nota[Lmaior][Cmaior]+"\n"
						 + "\n"
						 + "Menor nota: \n"
						 + "Nome: "+nome[Lmenor]+"\n"
						 + "Nota: "+nota[Lmenor][Cmenor]+"\n"
						 + "\n"
						 + "Maior média: \n"
						 + "Nome: "+nome[maiorMed]+"\n"
						 + "Média: "+media[maiorMed]+"\n"
						 + "\n"
						 + "Menor média: \n"
						 + "Nome: "+nome[menorMed]+"\n"
						 + "Média: "+media[menorMed]+"\n"
						 + "\n"
						 + "Média geral da turma: "+medGeral+"\n");
		
		for (int i = 0; i < TAM; i++) {
			if (media[i] > medGeral) {
				System.out.println(nome[i]+" esta acima da média geral.");
			} else if (media[i] < medGeral) {
				System.out.println(nome[i]+" esta abaixo da média geral.");
			} else {
				System.out.println(nome[i]+" esta exatamente na média geral.");
			}
		}
		
		in.close();
		
		try {
			
			PrintWriter saida = new PrintWriter( new FileWriter("Notas.txt"));
			
			for (int linha = 0; linha < TAM; linha++) {
				saida.println("Aluno: "+nome[linha]);
				for (int coluna = 0; coluna < 2; coluna++) {
					saida.println("nota "+(coluna+1)+": "+nota[linha][coluna]);
				}
				saida.println("Média: "+media[linha]+"\n");
			}
			
			saida.println("Maior nota: \n"
							 + "Nome: "+nome[Lmaior]+"\n"
							 + "Nota: "+nota[Lmaior][Cmaior]+"\n"
							 + "\n"
							 + "Menor nota: \n"
							 + "Nome: "+nome[Lmenor]+"\n"
							 + "Nota: "+nota[Lmenor][Cmenor]+"\n"
							 + "\n"
							 + "Maior média: \n"
							 + "Nome: "+nome[maiorMed]+"\n"
							 + "Média: "+media[maiorMed]+"\n"
							 + "\n"
							 + "Menor média: \n"
							 + "Nome: "+nome[menorMed]+"\n"
							 + "Média: "+media[menorMed]+"\n"
							 + "\n"
							 + "Média geral da turma: "+medGeral+"\n");
			
			for (int i = 0; i < TAM; i++) {
				if (media[i] > medGeral) {
					saida.println(nome[i]+" esta acima da média geral.");
				} else if (media[i] < medGeral) {
					saida.println(nome[i]+" esta abaixo da média geral.");
				} else {
					saida.println(nome[i]+" esta exatamente na média geral.");
				}
			}
			
			saida.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
