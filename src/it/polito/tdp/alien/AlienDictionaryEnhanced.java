	package it.polito.tdp.alien;
	import java.util.LinkedList;
	import java.util.List;

public class AlienDictionaryEnhanced {

		private List <WordEnhanced> alien= new LinkedList<WordEnhanced>();
		public void addWord(String alienWord, String traslation)
		{
			WordEnhanced wd= new WordEnhanced(alienWord, traslation);
			for( WordEnhanced wo: alien)
			if(wo.compare(alienWord))
				{wo.setTraslation(traslation);
			return; //mi chiude il ciclo
			}
			alien.add(wd);
				
		}

		public List <String> traslateWord(String alienWord)
		{
			for(WordEnhanced we: alien)
			if(we.compare(alienWord))
			return we.getTraslation();
			return null;
			
}
		public List <WordEnhanced> parole(){
			return alien;
		} 
		public void reset() {
			alien.clear();
			
		}
		}

