public class Truck  extends Vehicle{
    @Override
	InsuranceQuote evaluateInsurance() {
		
		return new InsuranceQuote("Truck Insurance", 500, 12);
	}
}
