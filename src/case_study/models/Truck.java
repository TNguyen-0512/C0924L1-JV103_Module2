package case_study.models;

public class Truck extends Vehicle {
    private double payLoad;
    public Truck() {}
    public Truck(String numberPlate, String manuFacturer, int productionYear, String owner, double payLoad) {
        super(numberPlate, manuFacturer, productionYear, owner);
        this.payLoad = payLoad;
    }
    public double getPayLoad() {
        return payLoad;
    }
    public void setPayLoad(double payLoad) {
        this.payLoad = payLoad;
    }

    @Override
    public String toString() {
        return "Truck "+
                super.toString()+
                "payLoad: "+payLoad;
    }
}
