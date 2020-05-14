package builder;

public class BuilderMain {

	public BuilderMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		
		Cake vanillaCake=new Cake.Builder().vanilia(2).eggs(2).milk(3).sugar(1.5).build();
		Cake cocoaCake=new Cake.Builder().cocoa(10).eggs(1).milk(1).sugar(4).build();
		System.out.println(vanillaCake.toString());
		
	}

	

}
