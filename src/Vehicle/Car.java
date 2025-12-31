package Vehicle;

public class Car extends Vehicle{
	boolean airbags;
	Car(String brand, String model, double basePrice, boolean airbags)
	{
		super(brand, model, basePrice);
		this.airbags = airbags;
	}
	
	double calculatePremium()
	{
		double basePrice = super.calculatePremium();
		if(airbags)
		{
			return basePrice + (basePrice * 0.12);
		}
		else
		{
			return basePrice + (basePrice * 0.05);
		}
	}
}
