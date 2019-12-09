package rentcar;

public abstract class Car {

    private final double CAR_DISTANCE_PER_LITER; // 연비
    private double tripDistance; // 여행 거리

    public Car(double distancePerLiter, double tripDistance) {
        this.CAR_DISTANCE_PER_LITER = distancePerLiter;
        this.tripDistance = tripDistance;
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    abstract double getTripDistance();

    /**
     * 차종의 이름
     */
    abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
     */
    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}