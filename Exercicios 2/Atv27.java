package exercicios2;
import java.util.Scanner;
public class Atv27 {
	public static void main (String[]rgs) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Insira um número: ");
	    float num = in.nextFloat();
	    if (Math.round(num) == num) {
	      System.out.println("É inteiro.");
	    } else {
	      System.out.println("É decimal.");
	    }
	    in.close();
	}
}
