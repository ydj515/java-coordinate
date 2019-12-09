package rentcar;

public class K5 extends Car {
	
	private static final double CAR_DISTANCE_PER_LITER = 13;
	private static final String CAR_NAME = "K5";
	private double tripDistance;
	
	public K5(double tripDistance) {
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
