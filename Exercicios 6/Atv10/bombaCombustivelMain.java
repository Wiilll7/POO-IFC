package exercicios6.Atv10;

public class bombaCombustivelMain {

	public static void main(String[] args) {
		
		bombaCombustivel bomba = new bombaCombustivel();
		
		bomba.setQuantidadeCombustivel(400);
		bomba.setTipoCombustivel("Diesel");
		bomba.setValorLitro(8);
		
		System.out.println(bomba.getQuantidadeCombustivel());
		System.out.println(bomba.getTipoCombustivel());
		System.out.println(bomba.getValorLitro());
		
		System.out.println(bomba.abastecerPorLitro(8));
		System.out.println(bomba.abastecerPorValor(20));
		
		bomba.alterarValor(10);
		bomba.alterarCombustivel("Comum");
		
		System.out.println(bomba.getTipoCombustivel());
		System.out.println(bomba.getValorLitro());

	}

}
