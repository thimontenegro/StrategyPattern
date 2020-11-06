package state;


public interface SituacaoMario{
	
	void pegarCogumelo(Mario mario);
	void levarDano(Mario mario) throws Exception;
	void pegarFlor(Mario mario);
}