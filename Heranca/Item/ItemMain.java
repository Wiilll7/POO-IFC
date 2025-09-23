package MainPackage.Heranca.Item;

public class ItemMain {

	public static void main(String[] args) {
		
		Item i = new Item(3, "Abcde");
		System.out.println(i);
		
		Livro l = new Livro(4, "Abcde");
		l.setAutor("Carlos");
		System.out.println(l);
		
		Midia m = new Midia(5, "Abcde");
		m.setDuracao(1.20f);
		m.setGravadora("GravaDoCarlinhos");
		System.out.println(m);
		
		CD c = new CD(6, "Abcde");
		c.setAlbum("AlbumDoCarlos");
		c.setArtista("Carlos");
		c.setDuracao(1.23f);
		c.setFaixas(3);
		c.setGravadora("GravadoraMassa");
		System.out.println(c);
		
		VHS v = new VHS(7, "Abcde");
		v.setDuracao(1.30f);
		v.setGravadora("GravadoraLegal");
		v.setTitulo("FaixasLegais");
		System.out.println(v);

	}

}
