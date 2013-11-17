public class Starter extends Suit {
	private Randomization leave;
	private Randomization leaveReseve;
	private double value;
	private String word;
	private int i;

	public Starter(int nest, int i) {
		this.i = i;

		int j = (int) (Math.random() * 90);
		if (nest > 1) {
			leave = new Starter(nest - 1, j);
			leaveReseve = new Starter(nest - 1, j);
		} else {
			int g1 = (int) (Math.random() * 2);
			leave = new Ender(g1);
			int g2 = (int) (Math.random() * 2);
			leaveReseve = new Ender(g2);
		}

	}

	@Override
	public double reValue(double x, double y) {

		if (i >= 0 && i<30) {
			value = Math.sin((3.14 * (leave.reValue(x, y))));
			word = "Sin(" + leave.reString() + ")";
		} else if (i >=30 && i<60) {
			value = Math.cos((3.14 * (leave.reValue(x, y))));
			word = "Cos(" + leave.reString() + ")";
		} else if (i >=60 && i<90) {
			value = ((leave.reValue(x, y)) + (leaveReseve.reValue(x, y))) / 2;
			word = "Avrage(" + leave.reString() + "+"
					+ leaveReseve.reString() + ") ";
		} else if (i >=90 && i<95) {
			value = (leave.reValue(x, y)*(leaveReseve.reValue(x,y)));
			word = "Time(" + leave.reString() + "*"+leaveReseve.reString()+")";
		} else if (i >= 95 && i<100) {
			value = Math.pow (leave.reValue(x, y),leaveReseve.reValue(x, y));
			word = "Power(" + leave.reString()+ ""+leaveReseve.reString()+")";
		}
		return value;
	}

	@Override
	public String reString() {
		return word;
	}

}
