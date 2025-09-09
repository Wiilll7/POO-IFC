package exercicios6.Atv3;
import java.util.Scanner;

public class OperacoesMain {
	public static void main (String[]args) {
		
		Scanner in = new Scanner(System.in);
		Operacoes op = new Operacoes();
		
		System.out.println("Escolha qual operação deseja realizar: \n"
						 + "1. Soma\n"
						 + "2. Subtração\n"
						 + "3. Mutiplicação\n"
						 + "4. Divisão");
		int escolha = in.nextInt();
		
		System.out.println("Insira o primeiro numero: ");
		int numUm = in.nextInt();
		
		System.out.println("Insira o segundo número: ");
		int numDois = in.nextInt();
		
		op.setNumUm(numUm);
		op.setNumDois(numDois);
		op.setOperacao(escolha);
		
		System.out.println(op);
		
		in.close();
	}
}
