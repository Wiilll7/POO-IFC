package MainPackage.Heranca.NaveEspacial;

public class NaveEspacialMain {

	public static void main(String[] args) {
		
		NaveEspacial n = new NaveEspacial(10);
		System.out.println(n);
		
		Apollo11 a = new Apollo11(12);
		a.setTipoCombustivel("Gasolina");
		System.out.println(a);
		
		MillenniumFalcon m = new MillenniumFalcon(14);
		m.setClasseHiperpropulsor(20);
		System.out.println(m);

	}

}
