package it.polito.tdp.alien;


public class Word {
	private String alienWord;
	private String translation;
	
	public Word(String alienWord, String traslation) {
		this.alienWord=alienWord;
		this.translation= traslation;
	}
	public String getAlienWord() {
		return alienWord;
	}
	public String getTraslation() {
		return translation;
	}
	public boolean compare(String alienWord)
	{
		//metodo che controlla se la parola è gia 
		//presente nel dizionario. ritorna un booleano
		if(this.alienWord.equals(alienWord))
		return true;
			return false;
	}
	public void setTraslation(String traslation) {
		this.translation=traslation;
		
	}
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	
	
}
