package exercicios3;
import java.util.Scanner;
public class Atv4 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int anos = 0;
		System.out.println("Insira a população da cidade A (com menos habitantes): ");
		double popA = in.nextInt();
		System.out.println("Insira a taxa de crescimento da população A (maior taxa)");
		float taxaA = in.nextFloat();
		System.out.println("Insira a população da cidade B (com mais habitantes): ");
		double popB = in.nextInt();
		System.out.println("Insira a taxa de crescimento da população B (menor taxa)");
		float taxaB = in.nextFloat();
		taxaA = taxaA / 100;
		taxaB = taxaB / 100;
		if (popA > popB) {
			double troca = popA;
			popA = popB;
			popB = troca;
			System.out.println("Você inverteu o tamanho das cidades.");
		}
		if (taxaA < taxaB) {
			float troca = taxaA;
			taxaA = taxaB;
			taxaB = troca;
			System.out.println("Você inverteu a taxa de crescimento das cidades");
		}
		while (popA < popB) {
			popA += popA * taxaA;
			popB += popB * taxaB;
			anos++;
		}
		System.out.println("Vai demorar "+anos+" anos.");
		in.close();
	}
}
