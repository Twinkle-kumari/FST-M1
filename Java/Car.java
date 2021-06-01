package Activities;

public class Car {

	int make;
	String color;
	String Transmission;
	int tyres;
	int doors;
	
	Car() {
		
		tyres = 4;
		doors = 4;
		
	}

	public void DisplayCharacteristics() {
		
		System.out.println("The color of the Car is:" +color);
		System.out.println("The Make of the Car is:" +make);
		System.out.println("The Transmission of the Car is:" +Transmission);
		System.out.println("The number of doors on the Car is:" +doors);
		System.out.println("The number of tyres in the Car is:" +tyres);
		
		
		
		
	}

	public void Accerlarates() {
		System.out.println("The Car is moving forward");
	
	}

	public void Brakes() {
		System.out.println("The Car has stopped");
		
	}

}
