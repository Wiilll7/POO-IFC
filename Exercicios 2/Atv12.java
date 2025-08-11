package exercicios2;
import java.util.Scanner;
public class Atv12 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira seu salário atual: ");
		float  salarioI = in.nextFloat();
		int aumento;
		double valorA;
		double salarioF;
		if (salarioI <= 280) {
			aumento = 20;
			salarioF = salarioI * 1.20;
			valorA = salarioF - salarioI;
		} else if (salarioI <= 700) {
			aumento = 15;
			salarioF = salarioI * 1.15;
			valorA = salarioF - salarioI;
		} else if (salarioI <= 1500) {
			aumento = 10;
			salarioF = salarioI * 1.10;
			valorA = salarioF - salarioI;
		} else {
			aumento = 5;
			salarioF = salarioI * 1.05;
			valorA = salarioF - salarioI;
		}
		System.out.println("Salário antes do reajuste: R$"+salarioI+"\n"+
						   "Percentual de aumento aplicado: "+aumento+"%\n"+
						   "Valor do aumento: R$"+valorA+"\n"+
						   "Novo salário, após o aumento: R$"+salarioF);
		in.close();
	}
}
