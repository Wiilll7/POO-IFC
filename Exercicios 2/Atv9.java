package exercicios2;
import java.util.Scanner;
public class Atv9 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira sua altura: ");
		float altura = in.nextFloat();
		System.out.println("Insira seu peso: ");
		float peso = in.nextFloat();
		System.out.println("Selecione seu sexo: \n"+
					 	   "1. Masculino \n"+
						   "2. Feminino \n");
		int sexo = in.nextInt();
		if (sexo == 1) {
			double pesoI = (72.7*altura) - 58;
			System.out.println("Altura: "+altura+"\n"+
							   "Peso: "+peso+"\n"+
					           "Sexo: Masculino \n"+
							   "Peso Ideal: "+pesoI);
			if (peso > pesoI) {
				System.out.println("Você esta acima do peso ideal.");
			} else if (peso < pesoI) {
				System.out.println("Você esta abaixo do peso ideal.");
			} else {
				System.out.println("Você esta no peso ideal.");
			}
		}	else if (sexo == 2) {
				double pesoI = (62.1*altura) - 44.7;
				System.out.println("Altura: "+altura+"\n"+
						           "Peso: "+peso+"\n"+
						           "Sexo: Feminino \n"+
						           "Peso Ideal: "+pesoI);
				if (peso > pesoI) {
					System.out.println("Você esta acima do peso ideal.");
				} else if (peso < pesoI) {
					System.out.println("Você esta abaixo do peso ideal.");
				} else {
					System.out.println("Você esta no peso ideal.");
				}
			} else {
				System.out.println("Seleção de peso incorreta.");
			}
		in.close();
	}
}
