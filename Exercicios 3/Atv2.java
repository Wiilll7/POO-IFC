package exercicios3;
import java.util.Scanner;
public class Atv2 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		String user;
		String senha;
		do {
			System.out.println("Insira um nome de usuário: ");
			user = in.nextLine();
			System.out.println("Insira sua senha: ");
			senha = in.nextLine();
			if (user.equals(senha)) {
				System.out.println("Usuário e senha não podem ser iguais.");
			}
		} while (user.equals(senha));
		System.out.println("Registro concluido com sucesso.");
		in.close();
	}
}
