package state;


public class Mario {
	
	public long pontuacao = 0;
	public SituacaoMario mario =  new MarioPequeno();
	
	public void pegarCogumelo() {
		mario.pegarCogumelo(this);
		this.pontuacao += 1000;
	}
	
	public void levarDano() throws Exception {
		mario.levarDano(this);
	}
	
	public void pegarFlor() {
		mario.pegarFlor(this);
	}
	
	public void setSituacao(SituacaoMario novoMario) {
		this.mario = novoMario;
	}
	
}
