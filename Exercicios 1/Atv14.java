import java.util.Scanner;
public class Atv14 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quanto voce ganha por hora? ");
		float sHora = in.nextFloat();
		System.out.println("Quantas horas por mes voce trabalha? ");
		float hMes = in.nextFloat();
		float sBruto = sHora * hMes;
		double ir = sBruto * 0.11;
		double inss = sBruto * 0.08;
		double sindicato = sBruto * 0.05;
		double sLiquido = sBruto - ir - inss - sindicato;
		System.out.println(
				"+ Salário Bruto: R$"+ sBruto +"\n"+
				"- IR (11%): R$"+ ir + "\n"+
				"- INSS (8%): R$"+ inss +"\n"+
				"- Sindicato (5%): R$"+ sindicato +"\n"+
				"= Salário Liquido: R$"+ sLiquido +"\n");
		in.close();
	}
}
