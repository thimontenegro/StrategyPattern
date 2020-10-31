package bolos;

public class FabricaBoloChocolateComMorango extends FabricaBolo{

	@Override
	public void fazerCobertura() {
		System.out.println("Faz cobertura de morango");
		
	}

	@Override
	public void fazerMassa() {
		System.out.println("Faz a massa de chocolate");		
	}

}
