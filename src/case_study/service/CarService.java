package case_study.service;

import case_study.models.Car;
import case_study.models.Vehicle;
import case_study.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CarService implements IService<Vehicle> {
    private final String FILE_PATH = "src/case_study/data/car.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Vehicle> findAll() {
        List<Car> cars = new ArrayList<>();
       List<String> carList = ReadAndWriteFile.readFile(FILE_PATH);
    }

    @Override
    public void addVehicle() {

    }

    @Override
    public void updateVehicle() {

    }

    @Override
    public boolean deleteVehicle() {
        return false;
    }
}
