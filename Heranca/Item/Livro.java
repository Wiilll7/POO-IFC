package MainPackage.Heranca.Item;

public class Livro extends Item {

	private String autor;

	public Livro(int codigo, String descricao) {
		super(codigo, descricao);
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor.length() > 3)
		this.autor = autor;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
