import java.util.Scanner;
public class Atv8 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe quanto voce ganha por hora: ");
		float sHora = in.nextFloat();
		System.out.println("Informe quantas horas voce trabalha por mes: ");
		int hMes = in.nextInt();
		float sMes = sHora * hMes;
		System.out.println("O seu salario por mes é: " + sMes);
		in.close();
	}
}
