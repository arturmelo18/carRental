package model.services;

import model.entities.Client;

public class BrazilRentService implements RentService {

	private Double tax;

	private Client client;

	public BrazilRentService(Double tax, Client client) {
		super();
		this.tax = tax;
		this.client = client;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public double totalPrice(Integer hours) {
		return client.getCar().getPricePerHour() * hours * tax;
	}

}
