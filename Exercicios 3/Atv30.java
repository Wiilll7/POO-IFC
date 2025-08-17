package exercicios3;
import java.util.Scanner;
public class Atv30 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int x = 1;
		int i = 0;
		int[] codigo = new int[999];
		float [] altura = new float[999];
		float[] peso = new float[999];
		float alto = -999;
		int iAlto = 0;
		int iBaixo = 0;
		int iMagro = 0;
		int iGordo = 0;
		float baixo = 999;
		float magro = 999;
		float gordo = -999;
		float medPeso = 0;
		float medAltura = 0;
		do {
			i++;
			System.out.println("Informe o codigo da "+i+" pessoa: ");
			codigo[i] = in.nextInt();
			if (codigo[i] == 0) {
				break;
			}
			System.out.println("Informe a altura da "+i+" pessoa: ");
			altura[i] = in.nextFloat();
			medAltura += altura [i];
			if (altura[i] > alto) {
				alto = altura[i];
				iAlto = i;
			}
			if (altura[i] < baixo) {
				baixo = altura[i];
				iBaixo = i;
			}
			System.out.println("Informe o peso da "+i+" pessoa: ");
			peso[i] = in.nextFloat();
			medPeso += peso[i];
			if (peso[i] > gordo) {
				gordo = peso[i];
				iGordo = i;
			}
			if (peso[i] < magro) {
				magro = peso[i];
				iMagro = i;
			}
			System.out.println("1 para mais uma pessoa e 0 para sair.");
			x = in.nextInt();
		} while (x == 1);
		medPeso = medPeso / i;
		medAltura = medAltura / i;
		System.out.println( "Mais alto: \n"+
							"Código: "+codigo[iAlto]+"\n"+
							"Altura: "+altura[iAlto]+"\n"+
							"Peso: "+peso[iAlto]+"\n"+
							"\n"+
							"Mais baixo: \n"+
							"Código: "+codigo[iBaixo]+"\n"+
							"Altura: "+altura[iBaixo]+"\n"+
							"Peso: "+peso[iBaixo]+"\n"+
							"\n"+
							"Mais magro: \n"+
							"Código: "+codigo[iMagro]+"\n"+
							"Altura: "+altura[iMagro]+"\n"+
							"Peso: "+peso[iMagro]+"\n"+
							"\n"+
							"Mais gordo: \n"+
							"Código: "+codigo[iGordo]+"\n"+
							"Altura: "+altura[iGordo]+"\n"+
							"Peso: "+peso[iGordo]+"\n"+
							"\n"+
							"Média das alturas: "+medAltura+"\n"+
							"Média dos pesos: "+medPeso);
		in.close();
	}
}
