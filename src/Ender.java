public class Ender extends Suit {
	private double value;
	private String word;
	private int g;
    /*
     * @param g is the end value of class.
     */
	public Ender(int g) {
		this.g = g;
	}

	@Override
	public double reValue(double x, double y) {

		if (g == 0) {
			value = x;
			word = "x";
		} else if (g == 1) {
			value = y;
			word = "y";
		} else if (g == 2) {
			value = y + x;
			word = "y+x";
		} else if (g == 3) {
			value = y * x;
			word = "y*x";
		}
		return value;
	}

	@Override
	public String reString() {
		return word;
	}

}
