
public class Ender extends Suit {
     private double value;
     private String word;
     private int g ;
	public Ender(int g){
    this.g = g;
	}

	@Override
	public double reValue(double x ,double y) {
		//int i = (int)(Math.random()*4);
		if(g==0){
			value = x;
			word = "x";
		}else if(g==1){
            value = y;
            word = "y";
		}
		return value;
	}

	@Override
	public String reString() {
		return word;
	}
	
	
}
