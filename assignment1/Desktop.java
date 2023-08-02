package week3.assignment1;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("It displays the size of the desktop");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop d=new Desktop();
		d.desktopSize();
		d.computerModel();

	}

}
/*Package   :org.system
Class        :Computer
Methods   :computerModel()

Class        :Desktop
Methods   :desktopSize()

Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.*/