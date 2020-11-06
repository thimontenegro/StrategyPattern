package state;

public class MarioGrande implements SituacaoMario {
	
	private static final int pontuacao = 1000;
	@Override
	public void pegarCogumelo(Mario mario) {
		mario.pontuacao += pontuacao;
		
	}

	@Override
	public void levarDano(Mario mario) {
		// TODO Auto-generated method stub
		mario.setSituacao(new MarioPequeno());
	}

	@Override
	public void pegarFlor(Mario mario) {
		// TODO Auto-generated method stub
		mario.setSituacao(new MarioFogo());
	}

}
