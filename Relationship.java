package com.c2evaluation;

public class Relationship {

	public static void main(String[] args) {
		Nexon nexon = new Nexon();
		nexon.setCarcolor("Black");
		nexon.setSpeed(135);
		nexon.carDetail();
		nexon.NexonStart();
	}

}

/*
 * Is-A relationship depends on inheritance it is two type class
 * inheritance and interface inheritance
 * e.g. Car is Nexon
 * 
 * 
 * Has-A relationship used for code resuablity, it has a referance to an 
 * Instance of a another class or an other instance of the same class
 * e.g. Nexon Has a Engine
 * 
 * */

class CarIndia{
	private String carcolor;
	private int speed;
	
	public void carDetail(){
		System.out.println("Car color: "+carcolor+" and speed: "+speed);
	}
	
	public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
class Engine{
	public void start() {
		System.out.println("Started..");
	}
	public void stop() {
		System.out.println("Stopped.");
	}
}
class Nexon extends CarIndia{
	public void NexonStart() {
		Engine engine = new Engine();
		engine.start();
		engine.stop();
	}
}

