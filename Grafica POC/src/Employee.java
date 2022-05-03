import java.util.Date;

public abstract class Employee extends Entity {
	
	
	public Employee (String name) {
		super (name);
		this.mail = Util.setMailEmployee(this.name);
		
		
		
	}

}
