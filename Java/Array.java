package Activities;

public class Array {

	public static void main(String[] args) {
			String [] carMake = {"BMW","AUDI", "TOYOTA", "SUZUKI", "HONDA"};
             
			//This stores the size of the Array
	        int ilength = carMake.length;
	        System.out.println("Length of the Array is:" + ilength);
	        
	        //This is to access 1st element of an array directly with it's position
	        String sBMW = carMake[0];
	        System.out.println("First value of the array is ==>" +sBMW);
	        
	        //This is to access last element of an Array
	        String sHONDA = carMake [ilength-1];
	        
	        System.out.println("Last Value of the Array is ==>" +sHONDA);
	        
	}
	
}
