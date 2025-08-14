package exercicios3;
import java.util.Scanner;
public class Atv16 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Escolha o tamanho do conjunto: ");
    	int tam = in.nextInt();
    	int[] con;
    	con = new int[tam + 1];
    	int menor = 999999;
    	int maior = -9999999;
    	int soma = 0;
    	for (int i = 0; i < tam; i++) {
    		System.out.println("Insira o termo "+i+": ");
    		con[i] = in.nextInt();
    		if (con[i] > maior) {
    			maior = con[i];
    		}
    		if (con[i] < menor) {
    			menor = con[i];
    		}
    		soma += con[i];
    	}
    	System.out.println("A soma é: "+soma);
    	System.out.println("O menor é: "+menor);
    	System.out.println("O maior é: "+maior);
    	in.close();
    }
}