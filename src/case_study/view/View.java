package case_study.view;

import case_study.controller.VehicleController;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        VehicleController controller = new VehicleController();
        controller.showMenu();
    }
}
