package exercicios6.Atv4;
import java.util.Scanner;

public class SalarioMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Salario salario = new Salario();
		
		System.out.println("Insira quantas horas você trabalha por mês: ");
		int hora = in.nextInt();
		
		System.out.println("Insira quanto você ganha por hora trabalhada: ");
		int valorHora = in.nextInt();
		
		salario.setHora(hora);
		salario.setValorHora(valorHora);
		
		System.out.println(salario);
		
		in.close();
	}

}
