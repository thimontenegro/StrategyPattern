package bolos;

public class Cliente {
	public static void main(String[] args) {
		FabricaBoloBaunilhaComMorango fBoloBaunilha = new FabricaBoloBaunilhaComMorango();
		FabricaBoloChocolateComCaramelo fBoloChocolate = new FabricaBoloChocolateComCaramelo();
		FabricaBoloBaunilhaComCaramelo fBoloBaunilhaCaramelo = new FabricaBoloBaunilhaComCaramelo();
		FabricaBoloChocolateComMorango fBoloChocolateComMorango= new FabricaBoloChocolateComMorango();

		
		fBoloBaunilha.prepararBolo();
		fBoloChocolate.prepararBolo();
		fBoloBaunilhaCaramelo.prepararBolo();
		fBoloChocolateComMorango.prepararBolo();
		
	}
}
