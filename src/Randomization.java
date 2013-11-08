public class Randomization {
	private double temp;
	public Randomization() {
        
	}

	public double randomFunction(double x, double y, int nest) {
		if (nest == 1) {
			if (Math.random() % 2 == 0.00) {
				
				return   x;
			} else {
				
				return y;
			}
		} else {
			
			 int i = (int)Math.random()*23;
             if(i==0){ 
            	 return  randomFunction(sin(x),y,nest-1);
             }else if(i==1){
            	 return  randomFunction(sin(x),y,nest-1);
             }else if(i==2){
            	 return  randomFunction(sin(x),sin(y),nest-1);
             }else if(i==3){
            	 return  randomFunction(sin(x),cos(y),nest-1);
             }else if(i==4){
            	 return  randomFunction(sin(x),asin(y),nest-1);
             }else if(i==5){
            	 return  randomFunction(sin(x),acos(y),nest-1);
             }else if(i==6){
            	 return  randomFunction(sin(x),avg(x,y),nest-1);
             }else if(i==7){
            	 return  randomFunction(cos(x),y,nest-1);
             }else if(i==8){
            	 return  randomFunction(cos(x),sin(y),nest-1);
             }else if(i==9){
            	 return  randomFunction(cos(x),cos(y),nest-1);
             }else if(i==10){
            	 return  randomFunction(cos(x),asin(y),nest-1);
             }else if(i==11){
            	 return  randomFunction(cos(x),acos(y),nest-1);
             }else if(i==12){
            	
            	 return  randomFunction(cos(x),avg(x,y),nest-1);
             }else if(i==13){
            	 return  randomFunction(avg(x,y),sin(y),nest-1);
             }else if(i==14){
            	 return  randomFunction(avg(x,y),cos(y),nest-1);
             }else if(i==15){
            	 return  randomFunction(avg(x,y),asin(y),nest-1);
            	
             }else if(i==16){
            	 return  randomFunction(avg(x,y),acos(y),nest-1);
             }else if(i==17){
            	 return randomFunction(avg(x,y),y,nest-1);
             }else if(i==18){
            	 return  randomFunction(x,sin(y),nest-1);
             }else if(i==19){
            	 return  randomFunction(x,cos(y),nest-1);
             }else if(i==20){
            	 return  randomFunction(x,asin(y),nest-1);
             }else if(i==21){
            	 return  randomFunction(x,acos(y),nest-1);	 
             }else if(i==22){
            	 return  randomFunction(x,avg(x,y),nest-1);        	 
             }
  
           return  99 ;
		}
	
  
	}

	private double cos(double x) {
		return Math.cos(Math.PI *x);
	}

	private double sin(double x) {
		return Math.sin(Math.PI *x);
	}

	private double avg(double x, double y) {
		return x + y / 2;
	}

	private double asin(double x) {
		return Math.asin(Math.PI *x);
	}

	private double acos(double x) {
		return Math.acos(Math.PI *x);
	}
}
