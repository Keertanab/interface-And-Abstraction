package interfaceAndAbstraction;

public abstract class MySqlConnection implements DatabaseCollection{

	public void connect() {
		System.out.println(" connected");
		
	}

	public void disconnect() {
		System.out.println("disconnected");
		
	}

	public void executeUpdate() {
		System.out.println("Execute the update");
	}
	
	public abstract void executequery();

}
