package exercicios3;
import java.util.Scanner;
public class Atv3 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int numNome;
		int idade = 0;
		float salario = 0;
		char sexo = ' ';
		char civil = ' '; 
		do {
			do {
				System.out.println("Insira seu nome: ");
				String nome = in.nextLine();
				numNome = nome.length();
				if (numNome <= 3) {
					System.out.println("Precisa conter pelo menos 4 caracteres.");
					break;
				}
				System.out.println("Insira sua idade: ");
				idade = in.nextInt();
				if (idade < 0 || idade > 150) {
					System.out.println("Idade aceita entre 0 e 150 anos.");
					in.nextLine();
					break;
				}
				System.out.println("Insira seu salário: ");
				salario = in.nextFloat();
				if (salario <= 0) {
					System.out.println("Seu salário precisa ser maior que zero.");
					in.nextLine();
					break;
				}
				in.nextLine();
				System.out.println("Informe 'f' para feminino e 'm' para masculino: ");
				sexo = in.nextLine().charAt(0);
				if (sexo != 'f' && sexo != 'm') {
					System.out.println("Sexo inserido inválido.");
					break;
				}
				System.out.println("Estado civil:\n"+
								   "s - solteiro\n"+
								   "c - casado\n"+
								   "v - viúvo\n"+
								   "d - divorciado");
				civil = in.nextLine().charAt(0);
				if (civil != 's' && civil != 'c' && civil != 'v' && civil != 'd') {
					System.out.println("Estado civil inserido incorreto.");
					break;
				}
			} while (numNome <= 3 || idade < 0 || idade > 150 || salario <= 0 || (sexo != 'f' && sexo != 'm') || (civil != 's' && civil != 'c' && civil != 'v' && civil != 'd'));
		} while (numNome <= 3 || idade < 0 || idade > 150 || salario <= 0 || (sexo != 'f' && sexo != 'm') || (civil != 's' && civil != 'c' && civil != 'v' && civil != 'd'));
		System.out.println("Registro concluído.");
		in.close();
	}
}
