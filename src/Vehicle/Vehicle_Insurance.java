/*Q1. Vehicle Insurance System – Premium Calculation
Create the following class structure:
Parent class: Vehicle
 Fields: brand, model, basePrice
 Methods: calculatePremium() → returns basePrice * 0.05
Child classes:
Car → premium increases by 12% if the car has airbags, otherwise 5%
Bike → premium increases by 8% if bike has ABS, otherwise 3%
Task:
Accept details for 5 vehicles (mix of Car and Bike).
Calculate premium using overridden logic.
Display the vehicle with the highest insurance premium.
Concepts Used
Method overriding
Polymorphism
Logical conditions
Finding maximum from object array
*/

package Vehicle;
import java.util.*;
public class Vehicle_Insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size: ");
		int size = sc.nextInt();
		
		Vehicle v[] = new Vehicle[size];
		
		for(int i = 0; i < v.length; i++)
		{
			System.out.println("Enter the Details of Vehicle: "+ (i+1));
			
			System.out.println("Is it Car or Bike(1.Car / 2.Bike)");
			String type = sc.next();
			
			System.out.println("Enter the Brand: ");
			String brand = sc.next();
			
			System.out.println("Enter the Model: ");
			String model = sc.next();
			
			System.out.println("Enter the Base Price: ");
			double basePrice = sc.nextDouble();
			
			if(type.equalsIgnoreCase("car"))
			{
				System.out.println("Has Airbags? (true/false): ");
				boolean airbags = sc.nextBoolean();
				v[i] = new Car(brand, model, basePrice, airbags);
			}
			else
			{
				System.out.println("Has ABS? (true/false): ");
				boolean abs = sc.nextBoolean();
				v[i] = new Bike(brand, model, basePrice, abs);
			}
			
			Vehicle maxVehicle = v[0];
			double maxPremium = v[0].calculatePremium();
			
			for(int j = 1; j < v.length; j++)
			{
				double premium = v[i].calculatePremium();
				if(maxPremium < premium)
				{
					maxPremium = premium;
					maxVehicle = v[0];
				}
			}
			
			System.out.println("\n===== Vehicle with Highest Premium =====");
	        System.out.println("Brand: " + maxVehicle.brand);
	        System.out.println("Model: " + maxVehicle.model);
	        System.out.println("Calculated Premium: " + maxPremium);
		}
	}

}
