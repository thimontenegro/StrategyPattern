package state;

public class MarioPequeno implements SituacaoMario{

	@Override
	public void pegarCogumelo(Mario mario) {
		// TODO Auto-generated method stub
		mario.setSituacao(new MarioGrande());
	}

	@Override
	public void levarDano(Mario mario) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Mario morreu.");
	}

	@Override
	public void pegarFlor(Mario mario) {
		// TODO Auto-generated method stub
		mario.setSituacao(new MarioFogo());
		
	}

}
