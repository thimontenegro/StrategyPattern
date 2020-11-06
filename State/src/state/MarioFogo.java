package state;

public class MarioFogo implements SituacaoMario{
	private static final int pontuacao = 1000;
	@Override
	public void pegarCogumelo(Mario mario) {
		// TODO Auto-generated method stub
		mario.pontuacao += pontuacao;
	}

	@Override
	public void levarDano(Mario mario) {
		// TODO Auto-generated method stub
		mario.setSituacao(new MarioGrande());
		
	}

	@Override
	public void pegarFlor(Mario mario) {
		// TODO Auto-generated method stub
		mario.pontuacao += pontuacao;
		
	}

}
