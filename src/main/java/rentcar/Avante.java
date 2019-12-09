package rentcar;

public class Avante extends Car {

	private static final double CAR_DISTANCE_PER_LITER = 15;
	private static final String CAR_NAME = "Avante";
	private double tripDistance;

	public Avante(double tripDistance) {
		super(CAR_DISTANCE_PER_LITER, tripDistance);
		this.tripDistance = tripDistance;
	}

	@Override
	double getDistancePerLiter() {
		return CAR_DISTANCE_PER_LITER;
	}

	@Override
	double getTripDistance() {
		return tripDistance;
	}

	@Override
	String getName() {
		return CAR_NAME;
	}

}
