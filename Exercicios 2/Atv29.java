package exercicios2;
import java.util.Scanner;
public class Atv29 {
	public static void main (String[]args) {
	    Scanner in = new Scanner(System.in);
	    int cont = 0;
	    System.out.println("Você telefonou para a vítima?\n"+
	                       "1. Sim \n"+
	                       "2. Não");
	    int res = in.nextInt();
	    if (res == 1){
	      cont++;
	    }
	    System.out.println("Você esteve no local do crime?\n"+
	                       "1. Sim \n"+
	                       "2. Não");
	    res = in.nextInt();
	    if (res == 1){
	      cont++;
	    }
	    System.out.println("Você mora perto da vítima? \n"+
	                       "1. Sim \n"+
	                       "2. Não");
	    res = in.nextInt();
	    if (res == 1){
	      cont++;
	    }
	    System.out.println("Você devia para a vítima? \n"+
	                       "1. Sim \n"+
	                       "2. Não");
	    res = in.nextInt();
	    if (res == 1){
	    cont++;
	    }
	    System.out.println("Você já trabalhou com a vítima? \n"+
	                       "1. Sim \n"+
	                       "2. Não");
	    res = in.nextInt();
	    if (res == 1){
	    cont++;
	    }
	    if (cont == 2){
	      System.out.println("Suspeito.");
	    } else if (cont == 3 || cont == 4) {
	      System.out.println("Cúmplice.");
	    } else if (cont == 5){
	      System.out.println("Assassino.");
	    } else {
	      System.out.println("Inocente.");
	    }
	    in.close();
	}
}
