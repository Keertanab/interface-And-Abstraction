package interfaceAndAbstraction;

public class JavaConnection extends MySqlConnection {

	@Override
	public void executequery() {

		System.out.println("Execute the query");
		
	}
	
	public static void main(String[] args) {
		 JavaConnection jc = new JavaConnection();
		 
		 jc.connect();
		 jc.disconnect();
		 jc.executeUpdate();
		 jc.executequery();
	}

}
