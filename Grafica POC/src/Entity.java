import java.util.Date;

public abstract class Entity {
	
	
	private final long ID;
	protected String name;
	protected String mail;
	
	
	public Entity(String name, String mail) {
		this.ID = Util.generateId();
		this.name = name;
		this.mail = mail;
	}
	
	public Entity(String name) {
		this.ID = Util.generateId();
		this.name = name;
				
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public long getID() {
		return ID;
	}
}
	
	
