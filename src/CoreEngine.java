
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;


import javax.swing.border.Border;
import javax.swing.border.TitledBorder;



import javax.swing.JPanel;


import java.awt.Color;

public class CoreEngine extends JPanel {
	private int width ;
	private int height ;
	
	private int nest=1;
	
	
	public CoreEngine(){
		
		setPreferredSize(new Dimension(400,320));
		
		
		
	
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		creatArt(g);
		
		
	}
	
	public void creatArt(Graphics g){
		
		dynamicFunction(g,nest);
		//test(g,nest);
		
	}
	
	public void test(Graphics g ,int nested){
		g.drawOval(50, 50, 400, 400);
	}
	
	private void dynamicFunction(Graphics g,int nested){
		for(int j = 0 ; j<666;j++){
			g.setColor(dynamicColor());
			g.drawLine(0,j,666,j);
		}
		
		for(int x=0;x<359;x++){
			 g.drawOval(170,x-300,x+10,x);
		}
	
		for(int x=300;x>0;x--){
			g.setColor(dynamicColor());
			 g.drawOval(x-100,170,x-10,x);
		}
		
	}
	
	private Color dynamicColor(){
		int r = (int)(256*Math.random());
		int g = (int)(256*Math.random());
		int b = (int)(256*Math.random());
		return new Color(r,g,b);
	}

}
