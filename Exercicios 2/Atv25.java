package exercicios2;
import java.util.Scanner;
public class Atv25 {
	public static void main (String[]args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Insira a quantia que deseja sacar, sendo no mínimo 10 reais e no máximo 600 reais: ");
	    float valor = in.nextFloat();
	    int notas100 = 0, notas50 = 0, notas10 = 0, notas5 = 0, notas1 = 0;
	    if ((valor >= 10) && (valor <= 600)){
	      if (valor >= 100){
	        while (valor >= 100){
	          valor -= 100;
	          notas100++;
	        }
	        System.out.println(notas100+" notas de 100");
	      }
	      if (valor >= 50){
	        while (valor >= 50){
	          valor -= 50;
	          notas50++;
	        }
	        System.out.println(notas50+" notas de 50");
	      }
	      if (valor >= 10){
	        while (valor >= 10){
	          valor -= 10;
	          notas10++;
	        }
	        System.out.println(notas10+" notas de 10");
	      }
	      if (valor >= 5){
	        while (valor >= 5){
	          valor -= 5;
	          notas5++;
	        }
	        System.out.println(notas5+" notas de 5");
	      }
	      if (valor >= 1){
	        while (valor >= 1){
	          valor -= 1;
	          notas1++;
	        }
	        System.out.println(notas1+" notas de 1");
	      }
	    } else {
	      System.out.println("Valor inserido inválido.");
	    }
	    in.close();
	}
}
