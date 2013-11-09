import java.awt.Dimension;


import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;

import java.awt.Color;

public class CoreEngine extends JPanel {
	private int nest = 4;
	private Randomization ranR;
	private Randomization ranG;
	private Randomization ranB;

	public CoreEngine() {
		this.ranR = new RandR();
		this.ranG = new RandG();
		this.ranB = new RandB();
		setPreferredSize(new Dimension(400, 320));

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		creatArt(g);

	}

	public void creatArt(Graphics g) {
		for (int h = 0; h < getHeight(); h=h+1) {
			for (int v = 0; v < getWidth(); v=v+1) {

				 double x = ((((double) v) / getWidth()) * 2.0) - 1.0;
			    double y = ((((double) h) / getHeight()) * 2.0) - 1.0;

				System.out.println(x+ "   "+y);
				double R = ranR.randomFunction(x,y, nest);
	            double G = ranG.randomFunction(x,y, nest);
				double B = ranB.randomFunction(x,y, nest);


				
				System.out.println(R + "  " + G + "  " + B);
				Color color = new Color(decodeColor(R), decodeColor(G),
						decodeColor(B));
				System.out.println("R" + decodeColor(R));
				System.out.println("G" + decodeColor(G));
				System.out.println("B" + decodeColor(B));
				g.setColor(color);
				g.fillRect(v, h, 1, 1);
			

			}
			
			
		}
	}

	public int decodeColor(double color) {
		
		color = color+ 1.0;
		if (color < 0) {
			color =color*( -1);
		}
		color =color/ 2.0;
		int c = (int) (color * 255);
		if (c >= 255) {
			c = 255;
		}
		return c;
	}

}
