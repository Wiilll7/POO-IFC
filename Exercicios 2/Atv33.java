package exercicios2;
import java.util.Scanner;
public class Atv33 {
	public static void main (String[]args) {
	    Scanner in = new Scanner(System.in);
	    int contador = 0;
	    char[] res;
	    res = new char[10];
	    for (int i = 0; i<10; i++) {
	      System.out.println("Insira a resposta da questão "+(i+1));
	      res[i] = in.nextLine().charAt(0);
	    }
	    if (res[0] == 'a') {
	      System.out.println("Q1: a: Correto");
	      contador++;
	    } else {
	      System.out.println("Q1: "+res[0]+": Errada, resposta correta (a)");
	    }
	    if (res[1] == 'a') {
	      System.out.println("Q2: a: Correto");
	      contador++;
	    } else {
	      System.out.println("Q2: "+res[1]+": Errada, resposta correta (a)");
	    }
	    if (res[2] == 'b') {
	      System.out.println("Q3: b: Correto");
	      contador++;
	    } else {
	      System.out.println("Q3: "+res[2]+": Errada, resposta correta (b)");
	    }
	    if (res[3] == 'b') {
	      System.out.println("Q4: b: Correto");
	      contador++;
	    } else {
	      System.out.println("Q4: "+res[3]+": Errada, resposta correta (b)");
	    }
	    if (res[4] == 'c') {
	      System.out.println("Q5: c: Correto");
	      contador++;
	    } else {
	      System.out.println("Q5: "+res[4]+": Errada, resposta correta (c)");
	    }
	    if (res[5] == 'c') {
	      System.out.println("Q6: c: Correto");
	      contador++;
	    } else {
	      System.out.println("Q6: "+res[5]+": Errada, resposta correta (c)");
	    }
	    if (res[6] == 'd') {
	      System.out.println("Q7: d: Correto");
	      contador++;
	    } else {
	      System.out.println("Q7: "+res[6]+": Errada, resposta correta (d)");
	    }
	    if (res[7] == 'd') {
	      System.out.println("Q8: d: Correto");
	      contador++;
	    } else {
	      System.out.println("Q8: "+res[7]+": Errada, resposta correta (d)");
	    }
	    if (res[8] == 'e') {
	      System.out.println("Q9: e: Correto");
	      contador++;
	    } else {
	      System.out.println("Q9: "+res[8]+": Errada, resposta correta (e)");
	    }
	    if (res[9] == 'e') {
	      System.out.println("Q10: e: Correto");
	      contador++;
	    } else {
	      System.out.println("Q10: "+res[9]+": Errada, resposta correta (e)");
	    }
	    System.out.println("Pontuação final: "+contador);
	    in.close();
	}
}
