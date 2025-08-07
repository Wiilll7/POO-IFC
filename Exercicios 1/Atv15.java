import java.util.Scanner;
public class Atv15 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe quantos metros quadrados serão pintados: ");
		int metros = in.nextInt();
		int litros = metros / 3;
		int latas = (litros / 18) + 1;
		float valor = latas * 80;
		System.out.println("Voce precisara de "+latas+" latas de tinta e custara R$"+valor);
		in.close();
	}
}
