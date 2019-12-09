package rentcar;

import java.util.*;

public class RentCompany {

    private static final String NEWLINE = System.getProperty("line.separator");

    private List<Car> cars;

    private RentCompany() {
        this.cars = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {

        StringBuffer buffer = new StringBuffer();

        cars.stream().forEach(i-> {
            buffer.append(i.getName()).append(" : ").append(i.getChargeQuantity() + "리터").append(NEWLINE);
        });

        return buffer.toString();
    }
}
