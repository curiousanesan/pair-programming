

public class Util {
	
	private static long lastID = 0;
	
	public static long generateId() { // m?todo
		return ++lastID; //primeiro incrementa e depois retorna
				
	}
	
	public static String setMailEmployee (String name) {
		return name.toLowerCase() + "@grafica.com.br";
		
	}
	

}
