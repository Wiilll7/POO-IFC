package MainPackage.AgregacaoComposicao.HomeTheater;

public class Main {

	public static void main(String[] args) {
		
		SistemaSom som = new SistemaSom(220, 1, "Marca", "Modelo", 500);
		SistemaVideo video = new SistemaVideo(220, 3, "Marca", "Modelo", "Tipo", "Resolucao");
		HomeTheater ht = new HomeTheater(som, video);
		System.out.println(ht);

	}

}
