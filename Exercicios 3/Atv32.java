package exercicios3;
import java.util.Scanner;
public class Atv32 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int[] codigo = new int[5];
		int[] veiculos = new int[5];
		int[] vitimas = new int[5];
		int maiorVitima = -9999;
		int codMaior = 0;
		int codMenor = 0;
		int menorVitima = 9999;
		float medVeiculos = 0;
		float medAcidente = 0;
		int cont = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Insira o codigo da cidade "+(i+1)+": ");
			codigo[i] = in.nextInt();
			System.out.println("Insira o numero de veiculos: ");
			veiculos[i] = in.nextInt();
			medVeiculos += veiculos[i];
			System.out.println("Numero de acidentes de transito: ");
			vitimas[i] = in.nextInt();
			if (vitimas[i] > maiorVitima) {
				maiorVitima = vitimas[i];
				codMaior = codigo[i];
			}
			if (vitimas[i] < menorVitima) {
				menorVitima = vitimas[i];
				codMenor = codigo[i];
			}
			if (veiculos[i] < 2000) {
				medAcidente += vitimas[i];
				cont++;
			}
		}
		medVeiculos = medVeiculos / 5;
		medAcidente = medAcidente / cont;
		System.out.println("Maior indice de acidentes: "+maiorVitima);
		System.out.println("Codigo da cidade: "+codMaior);
		System.out.println("Menor indice de acidentes: "+menorVitima);
		System.out.println("Codigo da cidade: "+codMenor);
		System.out.println("Media de veiculos em todas as cidades: "+medVeiculos);
		System.out.println("Media de acidentes em cidades com menos de 2000 carros: "+medAcidente);
		in.close();
	}
}
