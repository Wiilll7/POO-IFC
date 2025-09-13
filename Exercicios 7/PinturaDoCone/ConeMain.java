package exercicios7.PinturaDoCone;

public class ConeMain {

	public static void main(String[] args) {
		
		Cone c = new Cone();
		
		c.setR(6);
		c.setH(8);
		c.setTipo(1);
		System.out.println(c);
		
		System.out.println("\n"
						 + "\n"
						 + "\n");
		
		c.setR(3.5f);
		c.setH(9);
		c.setTipo(2);
		System.out.println(c);
		
		System.out.println("\n"
						 + "\n"
						 + "\n");
		
		c.setR(37.78f);
		c.setH(16.53f);
		c.setTipo(3);
		System.out.println(c);
		
		System.out.println("\n"
						 + "\n"
						 + "\n");
		
	}

}
