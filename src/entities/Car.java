package entities;

public class Car {

	private String name;
	private long carBoard;

	public Car() {
	}

	public Car(String name, long carBoard) {
		this.name = name;
		this.carBoard = carBoard;
	}

	public String getName() {
		return name;
	}

	public long getCarBoard() {
		return carBoard;
	}

	public void setCarBoard(int carBoard) {
		this.carBoard = carBoard;
	}

	public String toString() {
		return "Car name:" + name + ". Car board: " + carBoard;
	}
}
