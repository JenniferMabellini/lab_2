package it.polito.tdp.alien;
import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {
	private List <Word> alienDictionary= new LinkedList<Word>();
	public void addWord(String alienWord, String traslation)
	{
		Word w= new Word(alienWord, traslation);
		for( Word wo: alienDictionary)
		if(alienDictionary.contains(alienWord))
			{wo.setTraslation(traslation);
		return; //mi chiude il ciclo
		}
			alienDictionary.add(w);
			
	}

	public String traslateWord(String alienWord)
	{
		String parolaTradotta=null;
		for(Word w: alienDictionary)
		if(w.compare(alienWord))
		{
		parolaTradotta=w.getTraslation();
		return parolaTradotta;
		}
	
			return null;

			}
	public void reset() {
		alienDictionary.clear();
		
	}
	}

