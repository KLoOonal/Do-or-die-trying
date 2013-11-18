import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Robot;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CoreEngine extends JPanel {
	private int nest;
	private Randomization ranR, ranG, ranB;
	// ///////////////////Wait for input//////////////////////////////
	private int blaze;
	private int sword;
	private int frost;
	private int sty = 1;
	private String namepic,name;
	// ///////////////////////////////////////////////////////////////
	private int b = (int) (Math.random() * blaze);
	private int s = (int) (Math.random() * sword);
	private int f = (int) (Math.random() * frost);
	// /////////////////////////////////////////////////
	
	
	private boolean gray = false;
	

	public CoreEngine(int nest) {
		this.nest = nest;
		setPreferredSize(new Dimension(400, 320));
		 blaze=90;
		 sword=90;
		frost=90;
	}
/////////////////OUT SIDE SET /////////////////////////////////////////////////////////
	public void setQuality(int b, int s, int f) {
		blaze = b;
		sword = s;
		frost = f;
	}
	
	public void setStyle(int sty){
		this.sty = sty;
	
	}

	public void setGray(boolean g) {
		gray = g;
	}
	
	public void setName(String namepic,String name){
		this.namepic = namepic;
		this.name =name;
	}
/////////////////////////////////////////////////////////////////////////////////////////
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		creatArt(g);
		
	}

	public void creatArt(Graphics g) {

		this.ranR = new Starter((int)(Math.random()*8+4), b, blaze,sty);
		this.ranG = new Starter((int)(Math.random()*8+4), s, sword,sty);
		this.ranB = new Starter((int)(Math.random()*8+4), f, frost,sty);

		for (int h = 0; h < getHeight(); h = h + 1) {
			for (int v = 0; v < getWidth(); v = v + 1) {

				double x = ((((double) v) / getWidth()) * 2.0) - 1.0;
				double y = ((((double) h) / getHeight()) * 2.0) - 1.0;

			//	System.out.println(x + "   " + y);

				double R = ranR.reValue(x, y);
				double G = ranG.reValue(x, y);
				double B = ranB.reValue(x, y);

				//System.out.println(ranR.reString());
				//System.out.println(ranG.reString());
			//	System.out.println(ranB.reString());

			//	System.out.println(R + "  " + G + "  " + B);
				Color color;
                if(gray==false){
				 color = new Color(decodeColor(R), decodeColor(G),
						decodeColor(B));
                } else{
                	 color = new Color(decodeColor(R), decodeColor(R),
    						decodeColor(R));
                }
                
			//	System.out.println("R" + decodeColor(R));
				//System.out.println("G" + decodeColor(G));
				//System.out.println("B" + decodeColor(B));
				g.setColor(color);
				g.fillRect(v, h, h, v);

			}

		}
	
	}
////////////////////OUT SIDE CALL ///////////////////////////////////////////////
	public String reStringRed() {

		return ranR.reString();
	}

	public String reStringGreen() {

		return ranG.reString();
	}

	public String reStringBlue() {

		return ranB.reString();
	}
///////////////////////////////////////////////////////////////////////////////////
	public int decodeColor(double color) {

		color = color + 1.0;

		if (color < 0) {
			color = color * (-1);
		}
		color = color / 2.0;
		int c = (int) (color * 255);

		if (c >= 255) {
			c = 255;
		}
		return c;

	}
	
	public void printc() throws IOException, AWTException{
		
		File file = new File(namepic+name+".jpg");
		if (!file.exists()){file.createNewFile();}
		
		
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(getLocationOnScreen().x, getLocationOnScreen().y,getWidth(), getHeight() ));
		ImageIO.write(image, "jpg", file);
	}
}


