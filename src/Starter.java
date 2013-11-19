/**
 *  component node of composite design pattern use to return function sin cos avarage and absolute.
 * 
 * @author 5501 &5502
 *
 */

public class Starter extends Suit {
	private Randomization leave;
	private Randomization leaveReseve;
	private double value;
	private String word;
	private int i;

	/**
	 * 
	 * @param nest = level of tree and structure.
	 * @param i is current function of this class.
	 * @param quality is boundary of each function to random in a next classes.
	 * @param style is a boundary of each x or y value .
	 */
	public Starter(int nest, int i, int quality, int style) {
		this.i = i;

		int j = (int) (Math.random() * quality);
		if (nest > 1) {
			leave = new Starter(nest - 1, j, quality, style);
			leaveReseve = new Starter(nest - 1, j, quality, style);
		} else {
			int g1 = (int) (Math.random() * style);
			leave = new Ender(g1);
			int g2 = (int) (Math.random() * style);
			leaveReseve = new Ender(g2);
		}

	}

	@Override
	public double reValue(double x, double y) {

		if (i >= 0 && i < 30) {
			value = Math.sin((3.14 * (leave.reValue(x, y))));
			word = "Sin(" + leave.reString() + ")";
		} else if (i >= 30 && i < 60) {
			value = Math.cos((3.14 * (leave.reValue(x, y))));
			word = "Cos(" + leave.reString() + ")";
		} else if (i >= 60 && i < 90) {
			value = ((leave.reValue(x, y)) + (leaveReseve.reValue(x, y))) / 2;
			word = "Avrage(" + leave.reString() + "+" + leaveReseve.reString()
					+ ") ";
		} else if (i >= 90 && i < 95) {
			value = (leave.reValue(x, y) * (leaveReseve.reValue(x, y)));
			word = "Time(" + leave.reString() + "*" + leaveReseve.reString()
					+ ")";
		} else if (i >= 95 && i < 100) {
			value = Math.abs(leave.reValue(x, y));
			word = "Absolute(" + leave.reString() + ")";
		}
		return value;
	}

	@Override
	public String reString() {
		return word;
	}

}
