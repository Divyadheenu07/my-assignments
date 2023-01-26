package day1;

public class Car {
	public void acclerate() {
		System.out.println("accelarate");
	}
	public void applyBreak() {
		System.out.println("apply break");
	} 
	public void switchOnAc () {
		System.out.println("ac is on");
	}
	public void adjustMirror () {
		System.out.println("mirror is adjusted");
	}
	public void applyGear () {
		System.out.println("1st gear applied");
	}
	public void adjustSeat () {
		System.out.println("seat is adjusted");
	}
	public static void main(String[] args) {
		
	 Car jaguar = new Car ();
	 jaguar.acclerate();
	 jaguar.applyBreak();
	 jaguar.switchOnAc();
	 jaguar.adjustMirror();
	 jaguar.applyGear();
	 jaguar.adjustSeat();
	}
}
