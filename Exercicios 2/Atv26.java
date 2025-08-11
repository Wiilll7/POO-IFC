package exercicios2;
import java.util.Scanner;
public class Atv26 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
	    System.out.println("Insira um valor inteiro: ");
	    int num = in.nextInt();
	    if ((num % 2) == 0) {
	      System.out.println("É par.");
	    } else {
	      System.out.println("É impar.");
	    }
	    in.close();
	}
}
