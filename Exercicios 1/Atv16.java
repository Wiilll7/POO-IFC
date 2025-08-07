import java.util.Scanner;
public class Atv16 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe quantos metros quadrados serão pintados: ");
		float metros = in.nextFloat();
		double litros = metros / 6;
		double lat = (litros / 18) + 1;
		int latas = (int) lat;
		double gal = (litros / 3.6) + 1;
		int galao = (int) gal;
		float valorL = latas * 80;
		float valorG = galao * 25;
		System.out.println("Se comprar apenas latas de 18L, precisara de "+ latas +" e custara R$"+ valorL);
		System.out.println("Se comprar apenas galao de 3,6L, precisara de "+ galao +" e custara R$"+ valorG);
		in.close();
	}
}
