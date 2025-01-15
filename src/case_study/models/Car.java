package case_study.models;

public class Car extends Vehicle {
    private int seatCount;
    private String carType;
    public Car() {}
    public Car(String numberPlate,String manuFacturer,int productionYear,String owner,int seatCount, String carType) {
        super(numberPlate, manuFacturer, productionYear, owner);
        this.seatCount = seatCount;
        this.carType = carType;
    }
    public int getSeatCount() {
        return seatCount;
    }
    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car" +
                "NumberPlate: "+ super.getNumberPlate() +
                "ManuFacturer: "+ super.getManuFacturer() +
                "ProductionYear: "+ super.getProductionYear() +
                "Owner: "+ super.getOwner() +
                "SeatCount: " + seatCount +
                "CarType: " + carType  ;
    }
}
