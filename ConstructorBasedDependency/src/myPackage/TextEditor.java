package myPackage;

public class TextEditor {
	private SpellChecker spellChecker;
	 
	   public TextEditor(SpellChecker spellChecker,int a) {
	      System.out.println("Inside TextEditor constructor."+a );
	      this.spellChecker = spellChecker;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
}
