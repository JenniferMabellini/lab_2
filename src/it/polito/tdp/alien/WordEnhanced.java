package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class WordEnhanced {

		private String alienWord;
		private List <String> traduzioni = new LinkedList<String>();
		
		public WordEnhanced(String alienWord, String traslation) {
			this.alienWord=alienWord;
			traduzioni.add(traslation);
		}
		public String getAlienWord() {
			return alienWord;
		}
		
		public boolean compare(String alienWord)
		{
				if(this.alienWord.equals(alienWord))
			return true;
				return false;
		}
		public void setTraslation(String traslation) {
			traduzioni.add(traslation);
			
		}
		public List <String> getTraslation() {
			return traduzioni;
		}
		public void setAlienWord(String alienWord) {
			this.alienWord = alienWord;
		}
		
		
	}

