package MainPackage.AgregacaoComposicao.CarroMotorPessoa;

public class Main {

	public static void main (String[]args) {
		
		Pessoa p = new Pessoa("Willian", "Ituporanga");
		Motor m = new Motor("Gol", "Gasolina", 800, 20);
		Carro c = new Carro(p, m, "Romulo", "Novo", "Azul", 2020);
		System.out.println(c);
		
	}
	
}
