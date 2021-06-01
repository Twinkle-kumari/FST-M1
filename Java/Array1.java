package Activities;

public class Array1 {

	public static void main(String[] args) {
		
		// Declaring an Array
		String [] carMake = {"BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA"};
		
		//Calling print_Array method and passing carMake as a parameter
		
		PrintArray (carMake);
	}
        //This method accepts Array as an argument of type string
	public static void PrintArray(String[] cars) {
		
		for (int i=0; i<= cars.length-1; i++)
		
		{System.out.println (cars[i]);
		
		
		
		
		
	}	
		
	}
}
