package model.entities;

public class Car {

	private String name;
	private Double pricePerHour;
	private String status;

	public Car(String name, Double pricePerHour) {
		this.name = name;
		this.pricePerHour = pricePerHour;
	}

	public String getName() {
		return name;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String toString() {
		return "Car name:" + getName() + ". Price per hour: " + getPricePerHour();
	}
}
