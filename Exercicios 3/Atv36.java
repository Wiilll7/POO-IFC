package exercicios3;
import java.util.Scanner;
public class Atv36 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int branco = 0;
		int nulo = 0;
		int voto = 0;
		do {
			System.out.println( "Escolha para votar: \n"+
								"1. João \n"+
								"2. José \n"+
								"3. Carlos \n"+
								"4. Rodrigo \n"+
								"6. Branco");
			voto = in.nextInt();
			if (voto == 1) {
				um++;
			} else if (voto == 2) {
				dois++;
			} else if (voto == 3) {
				tres++;
			} else if (voto == 4) {
				quatro++;
			} else if (voto == 6) {
				branco++;
			} else if (voto != 0) {
				nulo++;
			}
		} while (voto != 0);
		int total = um + dois + tres + quatro + branco + nulo;
		System.out.println( "Total de votos: \n"+
							"João: "+um+"\n"+
							"José: "+dois+"\n"+
							"Carlos: "+tres+"\n"+
							"Rodrigo: "+quatro+"\n"+
							"Nulos: "+nulo+"\n"+
							"Branco: "+branco+"\n"+
							"Porcentagem de nulos sobre o total: "+((nulo * 100) / total)+"% \n"+
							"Porcentagem de brancos sobre o total: "+((branco * 100) / total)+"%");
		in.close();
	}
}
