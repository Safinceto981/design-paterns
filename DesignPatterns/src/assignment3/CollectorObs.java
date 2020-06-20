package assignment3;

public class CollectorObs implements Observer {

	private String name;
	private ConcretePracel concretePracel;
	
	public  CollectorObs(String name) {
		this.name=name;
	}
	@Override
	public void update(Observable employee) {
		if(employee.getUpdate()==null) {
			System.out.println("nothing");
			return;
		}
		if(employee.getUpdate().equals(concretePracel)) {
			System.out.println(this.getName() + " got package from " + 
					   employee.getName() + " and headed to the warehouse.");
	employee.getState().resetState(employee);		
		}
String msg=(String)concretePracel.getUpdate(this);

if(msg == null){
	System.out.println(name+":: No new message");
}else
System.out.println(name+":: Consuming message::"+msg);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void setPracel(ConcretePracel pracel) {
	this.concretePracel=pracel;
		
	}
	

	
}
