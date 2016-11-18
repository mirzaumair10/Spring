package myPackage;

public class TextEditor {
	   private SpellChecker spellChecker;
	   private String name;

	   public TextEditor( SpellChecker spellChecker) {
		      this.spellChecker = spellChecker;
		   }
	   
	   public void setSpellChecker( SpellChecker spellChecker ){
	      this.spellChecker = spellChecker;
	   }
	   public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }

	   public void setName(String name) {
		   System.out.println("sett");
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }

	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	}