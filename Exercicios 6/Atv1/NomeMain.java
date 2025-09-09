package exercicios6.Atv1;
import java.util.Scanner;

public class NomeMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Nome nomeCompleto = new Nome();
		
		System.out.println("Insira seu primeiro nome: ");
		String nome = in.nextLine();
		
		System.out.println("Insira seu sobrenome: ");
		String sobrenome = in.nextLine();
		
		nomeCompleto.setPrimeiroNome(nome);
		nomeCompleto.setSobreNome(sobrenome);
		
		System.out.println(nomeCompleto);
		
		in.close();
	}

}
