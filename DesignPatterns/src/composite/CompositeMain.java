package composite;

public class CompositeMain {

	public static void main(String[] args) {

		Developer dev1=new Developer("Ivan", 1500);
		Developer dev2=new Developer("Petur", 2000);
		Manager manager1=new Manager("George", 3000);
		manager1.add(dev1);
		manager1.add(dev2);
		Developer dev3 = new Developer("Stoian", 3000);
		Manager rootManager=new Manager("Stamat", 7000);
		rootManager.add(manager1);
		rootManager.add(dev3);
		rootManager.printData();
	}

}
