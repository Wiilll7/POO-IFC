package exercicios2;
import java.util.Scanner;
public class Atv13 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o valor da sua hora trabalhada: ");
		float valorH = in.nextFloat();
		System.out.println("Informe quantas horas você trabalha: ");
		int horas = in.nextInt();
		float salarioB = valorH * horas;
		double descontos;
		double ir;
		int porIR;
		double inss;
		double fgts;
		double salarioL;
		if (salarioB <= 900) {
			porIR = 0;
			ir = 0;
			inss = salarioB * 0.10;
			fgts = salarioB * 0.11;
			descontos = inss;
			salarioL = salarioB - descontos;
		} else if(salarioB <= 1500) {
			porIR = 5;
			ir = salarioB * 0.05;
			inss = salarioB * 0.10;
			fgts = salarioB * 0.11;
			descontos = inss + ir;
			salarioL = salarioB - descontos;
		} else if(salarioB <= 2500) {
			porIR = 10;
			ir = salarioB * 0.10;
			inss = salarioB * 0.10;
			fgts = salarioB * 0.11;
			descontos = inss + ir;
			salarioL = salarioB - descontos;
		} else {
			porIR = 20;
			ir = salarioB * 0.20;
			inss = salarioB * 0.10;
			fgts = salarioB * 0.11;
			descontos = inss + ir;
			salarioL = salarioB - descontos;
		}
		System.out.println("Salário Bruto: ("+valorH+" * "+horas+") = R$"+salarioB+"\n"+
						   "(-) IR ("+porIR+"%): R$"+ir+"\n"+
						   "(-) INSS (10%): R$"+inss+"\n"+
						   "FGTS (11%): R$"+fgts+"\n"+
						   "Total de descontos: R$"+descontos+"\n"+
						   "Salário Liquido: R$"+salarioL);
		in.close();
	}
}
