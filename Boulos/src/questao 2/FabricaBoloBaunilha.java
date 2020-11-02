package bridge;

public class FabricaBoloBaunilha  implements Fabrica {
	protected Cobertura cobertura;
	
	public  FabricaBoloBaunilha() {}
	public FabricaBoloBaunilha(Cobertura cobertura) {
		this.cobertura = cobertura;
	}
	@Override
	public void fazerMassa() {
		System.out.println("Faz massa de baunilha");
		
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
