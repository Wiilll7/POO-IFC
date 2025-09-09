package exercicios6.Atv6;

public class QuadradoMain {

	public static void main(String[] args) {
		
		Quadrado q = new Quadrado();
		
		q.setTamLado(4);
		System.out.println(q.retornaLado());
		System.out.println(q.area());
		q.alterarLado(8);
		System.out.println(q.retornaLado());
		System.out.println(q.area());
		
	}

}
