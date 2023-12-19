import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.server.*;
import java.rmi.registry.LocateRegistry;

public class ContactServer {

	public static void main(String[] args) throws Exception {

		long number = 894911442;
		LocateRegistry.createRegistry(1099);
		System.out.println("Java RMI registry created");

		ContactImpl cb = new ContactImpl("Deepansh", "Dubey", number);
		Naming.rebind("toaster", cb);

	}

}
