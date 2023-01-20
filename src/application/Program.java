package application;

import java.util.Scanner;

import entities.Car;
import entities.Client;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;

		Car[] cars = new Car[3];
		Client[] client = new Client[cars.length];

		for (int i = 0; i < 3; i++) {
			System.out.println("Car name:");
			String carName = sc.nextLine();
			System.out.println("Car board:");
			long carBoard = sc.nextLong();
			sc.nextLine();
			if (carBoard > 9999999 || carBoard < 9999999) {
				System.out.println("There's no such sign! Enter another");
				carBoard = sc.nextLong();
				sc.nextLine();
				cars[i] = new Car(carName, carBoard);
			} else {
				cars[i] = new Car(carName, carBoard);
			}

		}

		do {
			System.out.println("--------------------------------------");
			System.out.println("---------1) Rent a car----------------");
			System.out.println("---------2) See cars already rented---");
			System.out.println("--------------------------------------");

			int a = sc.nextInt();

			switch (a) {
			case 1:
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + ") " + cars[i]);
				}
				System.out.println("Which car do you want?");
				int x = sc.nextInt();
				switch (x) {
				case 1:
					System.out.println("Speak your name");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println("Speak your email");
					String email = sc.nextLine();
					System.out.println("Speak your document");
					long document = sc.nextLong();
					if (document > 99999999 || document < 99999999) {
						System.out.println("That document doesn't exist! Say another");
						document = sc.nextLong();
						client[0] = new Client(name, email, document);
					} else {
						client[0] = new Client(name, email, document);
					}
					System.out.println("You managed to rent the car: " + cars[0] + ". Congratulations!");
					break;
				case 2:
					System.out.println("Speak your name");
					sc.nextLine();
					String name1 = sc.nextLine();
					System.out.println("Speak your email");
					String email1 = sc.nextLine();
					System.out.println("Speak your document");
					long document1 = sc.nextLong();
					if (document1 > 99999999 || document1 < 99999999) {
						System.out.println("That document doesn't exist! Say another");
						document1 = sc.nextLong();
						client[1] = new Client(name1, email1, document1);
					} else {
						client[1] = new Client(name1, email1, document1);
					}
					System.out.println("You managed to rent the car: " + cars[1] + ". Congratulations!");
					break;
				case 3:
					System.out.println("Speak your name");
					sc.nextLine();
					String name2 = sc.nextLine();
					System.out.println("Speak your email");
					String email2 = sc.nextLine();
					System.out.println("Speak your document");
					long document2 = sc.nextLong();
					if (document2 > 99999999 || document2 < 99999999) {
						System.out.println("That document doesn't exist! Say another");
						document2 = sc.nextLong();
						client[2] = new Client(name2, email2, document2);
					} else {
						client[2] = new Client(name2, email2, document2);
					}
					System.out.println("You managed to rent the car: " + cars[0] + ". Congratulations!");
					break;
				}
				break;
			case 2:
				for (int i = 0; i < 3; i++) {
					if (client[i] != null) {
						System.out.println(cars[i]);
						System.out.println("Rented by: ");
						System.out.println(client[i]);
					}
				}
				break;
			}

		} while (n == 0);

		sc.close();
	}

}
