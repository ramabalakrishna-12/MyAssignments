package week3.assignment1;

public class Automation extends MultipleLanguage {

	
	public void Java() {
		System.out.println("Java program");
		
	}

	public void Selenium() {
		System.out.println("Selenium Tool");
		
	}

	@Override
	public void Ruby() {
		System.out.println("Unimplemented method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation au=new Automation();
		au.Java();
		au.Selenium();
		au.Python();
		au.Ruby();

	}


}
/*Interface :Language
Methods   :Java()
Interface :TestTool
Methods   :Selenium()
AbstractClass :MultipleLangauge
Methods   :python() and un implemented method as ruby()
Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class*/