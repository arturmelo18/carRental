package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Car;
import model.entities.Client;
import model.services.BrazilRentService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Client> client = new ArrayList<>();
		List<Car> car = new ArrayList<>();

		car.add(new Car("Uno", 20.0));
		car.add(new Car("T-Cross", 50.0));
		car.add(new Car("Livina", 30.0));

		int n = 0;

		do {
			System.out.println("Speak your name: ");
			String name = sc.nextLine();
			System.out.println("Speak your email: ");
			String email = sc.nextLine();

			System.out.println("--------------------------------------");
			System.out.println("---------1) Rent a car----------------");
			System.out.println("---------2) See cars already rented---");
			System.out.println("--------------------------------------");

			System.out.println("Choose an option");
			int x = sc.nextInt();

			switch (x) {
			case 1:
				int sum = 0;
				for (Car c : car) {
					sum++;
					System.out.println(sum + ") " + c);
				}
				System.out.println("Choose an car");
				int option = sc.nextInt();
				if (option == 1) {
					client.add(new Client(name, email, car.get(0)));
					System.out.println("How many hours will you rent the car for: ");
					int hours = sc.nextInt();
					sc.nextLine();
					BrazilRentService brs = new BrazilRentService(2.0, client.get(0));
					System.out.println("The total price will be: $" + String.format("5.2f", brs.totalPrice(hours)));
					client.get(0).getCar().setStatus("Rented");
				} else if (option == 2) {
					client.add(new Client(name, email, car.get(1)));
					System.out.println("How many hours will you rent the car for: ");
					int hours = sc.nextInt();
					sc.nextLine();
					BrazilRentService brs = new BrazilRentService(2.0, client.get(0));
					System.out.println("The total price will be: $" + String.format("%.2f", brs.totalPrice(hours)));
					client.get(0).getCar().setStatus("Rented");
				} else if (option == 3) {
					client.add(new Client(name, email, car.get(2)));
					System.out.println("How many hours will you rent the car for: ");
					int hours = sc.nextInt();
					sc.nextLine();
					BrazilRentService brs = new BrazilRentService(2.0, client.get(0));
					System.out.println("The total price will be: $" + String.format("5.2f", brs.totalPrice(hours)));
					client.get(0).getCar().setStatus("Rented");
				}
				System.out.println("Congratulations! You have successfully rented a car");
			case 2:
				for (Car c : car) {
					if (c.getStatus() != null) {
						System.out.println(c);
					}
				}
				sc.nextLine();
			}
		} while (n == 0);

		sc.close();
	}

}
