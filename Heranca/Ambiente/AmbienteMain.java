package MainPackage.Heranca.Ambiente;

public class AmbienteMain {

	public static void main(String[] args) {
		
		Ambiente a = new Ambiente(8);
		System.out.println(a);
		
		Quarto q = new Quarto(10);
		q.setCapacidade(2);
		System.out.println(q);
		
		Sala s = new Sala(12);
		s.setTv(true);
		System.out.println(s);
		
		Banheiro b = new Banheiro(6);
		b.setBanheira(true);
		System.out.println(b);
		
		Cozinha c = new Cozinha(14);
		c.setMicroondas(true);
		System.out.println(c);

	}

}
