public abstract  class Randomization {
	
	public Randomization() {
        
	}

   
	
	
    public abstract double randomFunction(double x ,double y,int nest);

	
  
    


public double sin(double x){
	return Math.sin(Math.PI *x);
}

public double cos(double x){
	return Math.cos(Math.PI*x);
}

public double avg(double x ,double y){
	if(x+y!=0){
	return x+y/2;
	}else {
		return 1;
	}
}


public double time(double x, double y){
              
	return x*y;	
}
}

