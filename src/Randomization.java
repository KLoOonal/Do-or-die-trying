import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Randomization {
	private double colorCode;
	private HashMap<Integer,Suit> map,map2;
	private double xLay,yLay;
	
	
	public Randomization(){
		
	}
	public double Randomize(double x, double y,int nest) {
         generateX(x,nest);
         generateY(y,nest);
         return xLay;
	}

   
	public void generateX(double x,int nest){
		map = new HashMap<Integer,Suit>();
		map.put(1,new Suit());
		Suit sut =map.get(1);
		double ans = sut.prepare(x);
		for(int c= 2 ; c<=nest ;c++){
			map.put(c,new Suit());
			Suit sute =map.get(c);
			ans = ans+ sute.prepare(x);
		}
		 xLay = ans;
	}
	
	public void generateY(double y, int nest){
		map = new HashMap<Integer,Suit>();
		map.put(1,new Suit());
		Suit sut =map.get(1);
		double ans = sut.prepare(y);
		for(int c= 2 ; c<=nest ;c++){
			map.put(c,new Suit());
			Suit sute =map.get(c);
			ans = ans+ sute.prepare(y);
		}
		 yLay = ans;
	}
	

	
	
	public double random(){
		return 0;
	}
	
   

    

}

