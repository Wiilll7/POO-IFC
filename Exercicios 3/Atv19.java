package exercicios3;
import java.util.Scanner;
public class Atv19 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int cont = 0;
		String numP = " ";
		System.out.println("Insira um número: ");
		int num = in.nextInt();

        for (int i = 2; i <= num; i++) {
            boolean primo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                cont++;
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                numP += i + " ";
            }
        }
        System.out.println("Números primos: " + numP);
        System.out.println("Divisões feitas: " + cont);
        in.close();
	}
}
