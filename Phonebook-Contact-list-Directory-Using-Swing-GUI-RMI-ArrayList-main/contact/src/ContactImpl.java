import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ContactImpl extends UnicastRemoteObject implements Contact {

	private String fname, lname;
	private long phonenumber;

	public ContactImpl(String fname, String lname, long ph) throws RemoteException {
		this.fname = fname;
		this.lname = lname;
		this.phonenumber = ph;
	}

	@Override
	public void add(String s) throws RemoteException {

		fname = s;
		lname = s;
	}

	@Override
	public void delete(String s) throws RemoteException {

		fname = s;
		lname = s;

	}

}
