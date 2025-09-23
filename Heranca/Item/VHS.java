package MainPackage.Heranca.Item;

public class VHS extends Midia {

	private String titulo;
	
	public VHS(int codigo, String descricao) {
		super(codigo, descricao);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo.length() > 3)
		this.titulo = titulo;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VHS [titulo=");
		builder.append(titulo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
