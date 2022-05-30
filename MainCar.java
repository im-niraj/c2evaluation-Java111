package com.c2evaluation;
import java.util.Scanner;

public class MainCar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of Passenger");
		int passenger = scanner.nextInt();
		System.out.println("Number of kms");
		int kms = scanner.nextInt();
		scanner.close();
		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(passenger, kms);
		
		int res = myOla.calculateBill(myCar);
		System.out.println("The total fare amount is "+ res);
		
	}

}

class Car{
	int numberOfPassenger;
	int numberOfKms;
	Car() {
		// TODO Auto-generated constructor stub
	}
	Car(int numberOfPassenger, int numberOfKms) {
		this.numberOfPassenger = numberOfPassenger;
		this.numberOfKms = numberOfKms;
	}
}

class Sedan extends Car{
	final int farePerKm =20;
	public Sedan() {
		// TODO Auto-generated constructor stub
	}
	public Sedan(int numberOfPassenger, int numberOfKMs) {
		super(numberOfPassenger,numberOfKMs);
	}
	
}
class HatchBack extends Car{
	final int farePerKm =15;
	public HatchBack() {
		// TODO Auto-generated constructor stub
	}
	public HatchBack(int numberOfPassenger, int numberOfKMs) {
		super(numberOfPassenger,numberOfKMs);
	}
	public int rate() {
		return farePerKm;
	}
}

class OLA{
	public Car bookCar(int numberOfPassenger, int numberOfKMs){
		if(numberOfPassenger <= 3) {
			HatchBack hatchBack = new HatchBack(numberOfPassenger,numberOfKMs);
			return hatchBack;
		}
		else {
			Sedan sedan = new Sedan(numberOfPassenger,numberOfKMs);
			return sedan;
		}
	}
	public int calculateBill(Car car) {
//		System.out.println(car);
		if(car.toString().equals("com.c2evaluation.HatchBack@19dfb72a")) {
			HatchBack hatchBack = new HatchBack();
			int totalfare = car.numberOfKms * hatchBack.farePerKm;
			return totalfare;
		}
		else if(car.toString().equals("com.c2evaluation.Sedan@19dfb72a")) {
			Sedan sedan = new Sedan();
			int totalfare = car.numberOfKms * sedan.farePerKm;
			return totalfare;
		}
		else {
			return 0;
		}
	}
}