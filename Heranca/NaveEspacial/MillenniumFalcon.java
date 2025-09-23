package MainPackage.Heranca.NaveEspacial;

public class MillenniumFalcon extends Apollo11 {

	private float classeHiperpropulsor;
	
	public MillenniumFalcon(double velocidade) {
		super(velocidade);
	}

	public float getClasseHiperpropulsor() {
		return classeHiperpropulsor;
	}

	public void setClasseHiperpropulsor(float classeHiperpropulsor) {
		if (classeHiperpropulsor > 0)
		this.classeHiperpropulsor = classeHiperpropulsor;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MillenniumFalcon [classeHiperpropulsor=");
		builder.append(classeHiperpropulsor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
