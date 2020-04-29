package composite;

public interface Employee {

	
	public void add(Employee employee);
	public void remove(Employee employee) ;
	public String getName();
	public double getSalary();
	
	public void printData();
}
