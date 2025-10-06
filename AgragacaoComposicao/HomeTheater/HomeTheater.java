package MainPackage.AgregacaoComposicao.HomeTheater;

public class HomeTheater {
	
	private SistemaSom som;
	private SistemaVideo video;
	
	public HomeTheater(SistemaSom som, SistemaVideo video) {
		this.som = som;
		this.video = video;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HomeTheater [som=");
		builder.append(som);
		builder.append(", video=");
		builder.append(video);
		builder.append("]");
		return builder.toString();
	}
	
}
