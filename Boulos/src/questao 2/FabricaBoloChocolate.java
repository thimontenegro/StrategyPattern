package bridge;

public class FabricaBoloChocolate implements Fabrica{
	protected Cobertura cobertura;
	
	public FabricaBoloChocolate() {}
	public FabricaBoloChocolate(Cobertura cobertura) {
		this.cobertura = cobertura;
	}
	
	@Override
	public void fazerMassa() {
		System.out.println("Faz massa de chocolate");
		
	}

	@Override
	public void levarAoForno() {
		System.out.println("leva ao forno");
		
	}
	
	public void prepararBolo() {
		fazerMassa();
		levarAoForno();
		cobertura.fazerCobertura();
		cobertura.decoraBolo();	
	}
	
	

}
