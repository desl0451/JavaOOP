package BBBB;

public final class Bus extends MotoVehicle {
	private int seatCount;

	@Override
	public int calRent(int days) {
		if (seatCount <= 16) {
			return 800 * days;
		} else {
			return 1500 * days;
		}
	}

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(String no, String brand, int seatCount) {
		super(no, brand);
		this.seatCount = seatCount;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
}
