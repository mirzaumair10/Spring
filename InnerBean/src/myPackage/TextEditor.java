package myPackage;

public class TextEditor {
	   private SpellChecker spellChecker1;

	   // a setter method to inject the dependency.
	   public void setSpellChecker(SpellChecker spellChecker2) {
	      System.out.println("Inside setSpellChecker." );
	      this.spellChecker1 = spellChecker2;
	   }
	   // a getter method to return spellChecker
	   public SpellChecker getSpellChecker() {
		   System.out.println("getSpellChecker()");
	      return spellChecker1;
	   }

	   public void spellCheck() {
		   System.out.println("spellCheck()");
	      spellChecker1.checkSpelling();
	   }
	}