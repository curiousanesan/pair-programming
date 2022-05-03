
public class Manager extends Employee {
	
	private String department;
	

	public Manager(String name, String department) {
		super(name);
		this.department = department;
	
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	

}
