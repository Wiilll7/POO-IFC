package exercicios4;
import java.util.Scanner;
public class Atv12 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 5;
		int[] idade = new int[TAM];
		float[] altura = new float[TAM];
		int Ivelho = 0;
		int Inovo = 0;
		int Ibaixo = 0;
		int Ialto = 0;
		float medA = 0;
		float medI = 0;
		
		for (int i = 0; i < TAM; i++) {
			System.out.println("Entre com a idade da pessoa "+(i+1)+": ");
			idade[i] = in.nextInt();
			medI += idade[i];
			System.out.println("Entre com a altura da pessoa "+(i+1)+": ");
			altura[i] = in.nextFloat();
			medA += altura[i];
			if (idade[i] < idade[Inovo]) {
				Inovo = i;
			} else if (idade [i] > idade[Ivelho]) {
				Ivelho = i;
			}
			if (altura[i] < altura[Ibaixo]) {
				Ibaixo = i;
			} else if (altura[i] > altura[Ialto]) {
				Ialto = i;
			}
		}
		
		medI = medI / TAM;
		medA = medA / TAM;
		
		for (int i = TAM; i > 0;) {
			i--;
			System.out.println("\n");
			System.out.println("Idade da pessoa "+(i+1)+": "+idade[i]);
			System.out.println("Altura da pessoa "+(i+1)+": "+altura[i]);
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < TAM; i++) {
			if (idade[i] < medI) {
				System.out.println("\n");
				System.out.println( "Pessoa "+(i+1)+" abaixo na média de idade, sua idade é: "+idade[i]+"\n"+
									"Altura dessa pessoa: "+altura[i]);
									
			} else if (idade[i] > medI) {
				System.out.println("\n");
				System.out.println( "Pessoa "+(i+1)+" acima na média de idade, sua idade é: "+idade[i]+"\n"+
									"Altura dessa pessoa: "+altura[i]);
			}
			if (altura[i] < medA) {
				System.out.println("\n");
				System.out.println( "Pessoa "+(i+1)+" abaixo na média de altura, sua idade é: "+idade[i]+"\n"+
									"Altura dessa pessoa: "+altura[i]);
			} else if (altura[i] > medA) {
				System.out.println("\n");
				System.out.println( "Pessoa "+(i+1)+" acima na média de altura, sua idade é: "+idade[i]+"\n"+
									"Altura dessa pessoa: "+altura[i]);
			}
			
		}
		System.out.println("\n");
		System.out.println( "Idade da pessoa mais velha: "+idade[Ivelho]+"\n"+
							"Altura da pessoa  mais velha: "+altura[Ivelho]+"\n"+
							"\n"+
							"Idade da pessoa mais nova: "+idade[Inovo]+"\n"+
							"Altura da pessoa  mais nova: "+altura[Inovo]+"\n"+
							"\n"+
							"Idade da pessoa mais baixa: "+idade[Ibaixo]+"\n"+
							"Altura da pessoa  mais baixa: "+altura[Ibaixo]+"\n"+
							"\n"+
							"Idade da pessoa mais alta: "+idade[Ialto]+"\n"+
							"Altura da pessoa  mais alta: "+altura[Ialto]+"\n");
							
		in.close();
	}
}
