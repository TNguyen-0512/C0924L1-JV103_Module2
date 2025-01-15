package case_study.models;

public class Motobike extends Vehicle {
    private int power;
    public Motobike() {}

    public Motobike(String numberPlate, String manuFacturer, int productionYear, String owner, int power) {
        super(numberPlate, manuFacturer, productionYear, owner);
        this.power = power;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motobike" +
                super.toString() +
                "Power: " + power;
    }
}
