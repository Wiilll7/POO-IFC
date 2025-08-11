package exercicios2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Atv7 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		Integer[] num = new Integer[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Insira um numero: ");
			num[i] = in.nextInt();
		}
		Arrays.sort(num, Collections.reverseOrder());
		System.out.println(Arrays.toString(num));
		in.close();
	}
}
