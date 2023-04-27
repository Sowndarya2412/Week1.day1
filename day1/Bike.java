package week1.day1;

public class Bike {
	public void applyBreak() {
		System.out.println("Applied Break for Bike");
	}
	
	public void soundHorn() {
		System.out.println("Sound Horn for Bike");
	}
	
	public static void main(String[] args) {
           Car obj = new Car();
           obj.applyBreak();
           obj.soundHorn();
           Bike obj1 = new Bike();
           obj1.applyBreak();
           obj1.soundHorn();
	}
}
