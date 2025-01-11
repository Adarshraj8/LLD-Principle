public class Car extends Vehicle {
    
    public InsuranceQuote evaluateInsurance(){
         return new InsuranceQuote("car insaurance", 1000, 2);
    }
}
