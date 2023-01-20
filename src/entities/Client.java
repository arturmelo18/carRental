package entities;

public class Client {

	private String name;
	private String email;
	private long document;

	public Client() {
	}

	public Client(String name, String email, long document) {
		super();
		this.name = name;
		this.email = email;
		this.document = document;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getDocument() {
		return document;
	}
	
	public String toString() {
		return "Client name: "
			   + name
			   + ". Client email: "
			   + email
			   + "Client document: "
			   + document;
	}
}
