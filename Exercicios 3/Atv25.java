package exercicios3;
public class Atv25 {
	public static void main(String[]args) {
		float valor = 0;
		for (int i = 1; i <= 50; i++) {
			System.out.println(i+" - R$"+(valor+=1.99));
		}	
	}
}
