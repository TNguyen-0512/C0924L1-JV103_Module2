package case_study.models;

public class Vehicle {
    private String numberPlate;
    private String manuFacturer;
    private int productionYear;
    private String owner;

    public Vehicle() {

    }
    public Vehicle(String numberPlate, String manuFacturer, int productionYear, String owner) {
        this.numberPlate = numberPlate;
        this.manuFacturer = manuFacturer;
        this.productionYear = productionYear;
        this.owner = owner;
    }
    public String getNumberPlate() {
        return numberPlate;
    }
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
    public String getManuFacturer() {
        return manuFacturer;
    }
    public void setManuFacturer(String manuFacturer) {
        this.manuFacturer = manuFacturer;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String toString() {
        return "NumberPlate: " + numberPlate +
                "ManuFacturer: " + manuFacturer +
                "ProductionYear: " + productionYear +
                "Owner: " + owner ;
    }
}
