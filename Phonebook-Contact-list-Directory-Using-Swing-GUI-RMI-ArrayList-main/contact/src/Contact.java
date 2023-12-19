import java.rmi.*;

public interface Contact extends Remote {

	public void add(String s) throws RemoteException;

	public void delete(String s) throws RemoteException;
	
}
