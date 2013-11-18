import javax.swing.JFrame;
public class MainClass {

	public static void main(String[] args) {

		GraphicUserInterFaceGz grap = new GraphicUserInterFaceGz();
		grap.setTitle("Art Generator : Shooting Star Dragon Edition");
		grap.setSize(640, 500);
		grap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		grap.setResizable(false);
		grap.setVisible(true);
	}
}
