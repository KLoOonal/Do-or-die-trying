
public class RandG extends Randomization{

	@Override
	public double randomFunction(double x, double y, int nest) {
		if(nest==1){
			return cos(x)+cos(y);
		}else{
			if(nest==1){
				return sin(x)+sin(y);
			}else{
				int i = (int)(Math.random()*2);
				if(i==0){
				return sin(randomFunction(x,y,nest-1))+cos(randomFunction(x,y,nest-1));	
				}else if(i==1){
					return cos(randomFunction(x,y,nest-1))+sin(randomFunction(x,y,nest-1));
				}
				return 0;		
		}
		
	}
	}
}
	

