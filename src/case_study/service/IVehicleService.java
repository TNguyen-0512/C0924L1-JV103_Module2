package case_study.service;

import case_study.models.Vehicle;

import java.util.List;

public interface IVehicleService<V> {
    void addVehicle(Vehicle vehicle);
    void displayAllVehicles();
    boolean deleteVehicleByPlate(String plateNumber);
    List<Vehicle> loadVehiclesFromFile(String fileName);

}
