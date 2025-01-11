public class InsuranceQuote{
    private String type;
    private double price;
    private int validity;

    public InsuranceQuote(String type,double price,int validity){
        this.type=type;
        this.price=price;
        this.validity=validity;

    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getValidity() {
        return validity;
    }

    public String toString(){
        return "Insaurance Quote :"+type +"price : $"+price+
        ", validity: "+validity;
    }
}