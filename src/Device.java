public class Device {
    private double price;
    private double weight;
    private String type;

    public Device(){

    }
    public Device(double p, double w, String t){
        this.price = p;
        this.type = t;
        this.weight = w;
    }
    public void setPrice(double p){
        this.price = p;
    }
    public void setWeight(double w){
        this.weight = w;
    }
    public void setType(double t){
        this.price = t;
    }
    public double getPrice(){
        return this.price;
    }
    public double getWeight(){
        return this.weight;
    }
    public String getType(){
        return this.type;
    }

}
