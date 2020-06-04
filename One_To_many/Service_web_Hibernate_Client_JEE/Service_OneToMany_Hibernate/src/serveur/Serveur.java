package serveur;

import service.*;
import javax.xml.ws.Endpoint;;
public class Serveur {
	public static final String SERVER ="http://localhost:";
	public static final String PORT ="9777/";
	//public static final String PORT1 ="3345/";

	public static void main(String[] args) {
		try {
			Endpoint.publish(SERVER+PORT, new Service());
			//Endpoint.publish(SERVER+PORT1, new ServiceCateg());

			System.err.println("=====================================");
			System.err.println("=======Server starting OK !=======");
		}
		catch(Exception e) {
			System.err.println("probleme starting server"+ e.getMessage());
		}
	}
}
