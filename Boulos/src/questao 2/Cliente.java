package bridge;

public class Cliente {

	public static void main(String[] args) {
		testBolo(new Caramelo());
		testBolo(new Morango());

	}

	private static void testBolo(Cobertura cobertura) {
		// TODO Auto-generated method stub
		FabricaBoloChocolate fBoloChocolate = new FabricaBoloChocolate(cobertura);
		fBoloChocolate.prepararBolo();
		
		FabricaBoloBaunilha fBoloBaunilha = new FabricaBoloBaunilha(cobertura);
		fBoloBaunilha.prepararBolo();
	}

}
