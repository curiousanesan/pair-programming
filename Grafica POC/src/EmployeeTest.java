
public class EmployeeTest {

	public static void main(String[] args) {
		
		Manager manager1 = new Manager("Pedro", "financial");		
		manager1.getID();
		System.out.println(manager1.getID());
		System.out.println(manager1.getName());
		System.out.println(manager1.getMail());
		System.out.println(manager1.getDepartment());
		
		Manager manager2 = new Manager ("Anelise","production");
		manager2.getID();
		System.out.println(manager2.getID());
		System.out.println(manager2.getName());
		System.out.println(manager2.getMail());
		System.out.println(manager2.getDepartment());
		
		
				
		

	}

}
