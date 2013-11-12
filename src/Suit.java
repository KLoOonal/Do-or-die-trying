

public class Suit {
    private static final double PI = Math.PI;
	private double result ;
    private String treat;
	
	public Suit(){
	    
	}
	
	
	public double prepare(double x){
	   
	    	int i =(int)(Math.random()*60);
	    	if(i==0 && i<=30){
	    		this.result=sin(x);
	    		this.treat = "Sin("+x+")";
	    	}else if(i>30 && i<=60){
	    	    this.result = cos(x);
	    	    this.treat = "Con("+x+")";
	    	}else if(i>60 && i<=70){
	    		this.result = ava(x,x);
	    		this.treat = "Avarage("+x+","+x+")";
	    	}else if(i>70 && i<=85){
	    		this.result = asin(x);
	    		this.treat = "ArcSin("+x+")";
	    	}else if(i>85&&i<=100){
	    		this.result = acos(x);
	    		this.treat = "ArcCos("+x+")";
	    	}
	    
	    
	    return result();
		
	}
	
	
	
	private double sin(double n){
		return Math.sin(PI*n);
	}
	
	private double cos(double n){
		return  Math.cos(PI*n);
	}
	
	private double asin(double n){
		return  Math.asin(PI*n);
	}
	
	private double acos(double n){
		return  Math.acos(PI*n);
	}
	
	private double ava(double n1,double n2){
		return  n1+n2/2;
	}
	

	
	public String retreat(){
		
		return this.treat;
	}
	
	public double result(){
		return this.result;
	}
	
}
