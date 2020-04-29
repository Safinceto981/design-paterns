package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

	private String name;
	private double salary;
	List<Employee> employees;

	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.employees = new ArrayList<Employee>();
	}

	@Override
	public void add(Employee employee) {

		this.employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		this.employees.add(employee);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getSalary() {
		return this.salary;
	}

	@Override
	public void printData() {

		System.out.println("[] Manager : "+this.getName()+" - "+this.getSalary());

		for(Employee employee:this.employees) {
			employee.printData();
		}
	}

}
