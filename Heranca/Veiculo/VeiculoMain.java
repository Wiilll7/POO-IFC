package MainPackage.Heranca.Veiculo;

public class VeiculoMain {

	public static void main(String[] args) {
		
		Veiculo v = new Veiculo(true);
		System.out.println(v);
		
		Caminhao c = new Caminhao(true);
		c.setEixos(8);
		System.out.println(c);
		
		Carro ca = new Carro(true);
		ca.setPortas(4);
		System.out.println(ca);
		
		Moto m = new Moto(true);
		m.setCilindradas(100);
		System.out.println(m);

	}

}
