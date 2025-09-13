package exercicios7.PinturaDoCubo;

public class CuboMain {

	public static void main(String[] args) {
		
		Cubo c = new Cubo();
		
		c.setA(4);
		c.setRendimento(2);
		c.setTipo(1);
		System.out.println(c);
		
		System.out.println("\n"
						 + "\n"
						 + "\n");
		
		c.setA(13.56f);
		c.setRendimento(1.5f);
		c.setTipo(3);
		System.out.println(c);
		
		System.out.println("\n"
						 + "\n"
						 + "\n");

		c.setA(107.45f);
		c.setRendimento(12.5f);
		c.setTipo(2);
		System.out.println(c);

	}

}
