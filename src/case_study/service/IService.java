package case_study.service;

import case_study.models.Vehicle;

import java.util.List;

public interface IService<V> {
    List<Vehicle> findAll();
    void addVehicle();
    void updateVehicle();
    boolean deleteVehicle();
}
