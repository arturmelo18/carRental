package model.entities;

public class Client {

	private String name;
	private String email;
	
	
	private Car car;

	public Client() {
	}

	public Client(String name, String email, Car car) {
		super();
		this.name = name;
		this.email = email;
		this.car = car;
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
	
	public Car getCar() {
		return car;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public String toString() {
		return "Client name: "
			   + getName()
			   + ". Client email: "
			   + getEmail()
			   + ". Rented car: "
			   + getCar();
	}
}
