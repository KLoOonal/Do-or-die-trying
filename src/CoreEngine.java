
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;


import javax.swing.border.Border;
import javax.swing.border.TitledBorder;



import javax.swing.JPanel;


import java.awt.Color;

public class CoreEngine extends JPanel {	
	private int nest=4;
	private Randomization ran;
	private double x=1.0;
	private double y=1.0;
	
	public CoreEngine(){
		 this.ran = new Randomization();
		setPreferredSize(new Dimension(400,320));
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		creatArt(g);
		
		
	}
	
	public void creatArt(Graphics g){
		for(int h =0;h<getHeight();h++){
			for(int v =0;v<getWidth();v++){
				
				double R = 10;//ran.randomFunction(this.x, this.y, nest) ;
				double G =10;// ran.randomFunction(this.x, this.y, nest) ;
				double B = 10;//ran.randomFunction(this.x, this.y, nest) ;
				System.out.println(R);
				Color color = new Color(decodeColor(R),decodeColor(G),decodeColor(B));
				g.setColor(color);
				g.fillRect(v, h, 1, 1);
				
			}
		}
	}
	
	
	public int decodeColor(double color){
	   	
		int c = (int)(color%257);
		
	return c;
	}
	
	

}
