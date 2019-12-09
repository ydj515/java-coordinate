package rentcar;

public class Sonata extends Car {

	private static final double CAR_DISTANCE_PER_LITER = 10;
	private static final String CAR_NAME = "Sonata";
	private double tripDistance;

	public Sonata(double tripDistance) {
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
