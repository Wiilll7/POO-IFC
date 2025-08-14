package exercicios3;
public class Atv15 {
	public static void main(String[]args) {
		int num1 = 37;
		int num2 = 38;
		int num3 = 1;
		double s = 0;
		for (int i = 1;i <= 37; i++) {
			s += (num1*num2)/num3;
			num1--;
			num2--;
			num3++;
		}
		System.out.println(s);
	}
}
