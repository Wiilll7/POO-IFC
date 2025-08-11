package exercicios2;
import java.util.Scanner;
public class Atv23 {
	public static void main (String[]args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Entre com a idade da primeira pessoa: ");
	    int idade1 = in.nextInt();
	    System.out.println("Entre com a idade da segunda pessoa: ");
	    int idade2 = in.nextInt();
	    System.out.println("Entre com a idade da terceira pessoa: ");
	    int idade3 = in.nextInt();
	    int media = (idade1 + idade2 + idade3) / 3;
	    if (media > 0 && media < 25){
	      System.out.println("A turma é jovem");
	    } else if (media >= 25 && media <=40){
	      System.out.println("A turma é adulta");
	    } else {
	      System.out.println("A turma é idosa");
	    }
	    in.close();
	}
}
