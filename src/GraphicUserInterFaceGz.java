import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;

public class GraphicUserInterFaceGz extends JFrame {

	public GraphicUserInterFaceGz() {
		setTitle("Art Generator : Prototype");
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		add(setOutputLabel(), BorderLayout.SOUTH);
		add(setSettingLabel(), BorderLayout.EAST);
		add(setScreenLabel(), BorderLayout.CENTER);
		setVisible(true);

	}

	private JPanel setScreenLabel() {
		JPanel labelScreen = new JPanel();
		Border title = BorderFactory.createTitledBorder("Image");
		((TitledBorder) title).setTitleJustification(TitledBorder.CENTER);
		labelScreen.setBorder(title);
		labelScreen.setPreferredSize(new Dimension(400, 320));
		CoreEngine core = new CoreEngine((int) (Math.random() * 8 + 4));
		// //JPanel labelScreen2 = new JPanel();
		// labelScreen2.setBackground(Color.black);
		// labelScreen2.setPreferredSize(new Dimension(400, 320));
		labelScreen.add(core);

		return labelScreen;
	}

	/**
	 * private JPanel callCore(){ CoreEngine core = new CoreEngine();
	 * 
	 * return core; }
	 **/

	private JPanel setSettingLabel() {
		JPanel labelSetting = new JPanel();
		labelSetting.setPreferredSize(new Dimension(160, 30));
		labelSetting.setLayout(new FlowLayout());
		labelSetting.add(settingBar());
		labelSetting.add(settingBar2());

		JLabel logo = new JLabel(new ImageIcon("Image/icon.png"));
		labelSetting.add(logo);

		labelSetting.add(generateBut());

		return labelSetting;
	}

	private JPanel settingBar() {
		JPanel bar = new JPanel();
		bar.setBorder(new TitledBorder("Input Value"));
		((TitledBorder) bar.getBorder())
				.setTitleJustification(TitledBorder.RIGHT);
		bar.setLayout(new GridLayout(2, 2, 1, 3));
		JLabel x = new JLabel();
		x.setText("X value");
		JLabel y = new JLabel();
		y.setText("Y value");

		TextField xValue = new TextField();
		xValue.setPreferredSize(new Dimension(70, 30));
		TextField yValue = new TextField();
		yValue.setPreferredSize(new Dimension(70, 30));

		bar.add(x);
		bar.add(xValue);
		bar.add(y);
		bar.add(yValue);
		return bar;
	}

	private JPanel settingBar2() {
		JPanel bar2 = new JPanel();
		bar2.setBorder(new TitledBorder("Setting"));
		((TitledBorder) bar2.getBorder())
				.setTitleJustification(TitledBorder.RIGHT);
		bar2.setLayout(new GridLayout(4, 2, 1, 3));

		JLabel name = new JLabel();
		name.setText("Pic Name");
		JLabel cname = new JLabel();
		cname.setText("by");
		JLabel color = new JLabel();
		color.setText("Color");
		JLabel dif = new JLabel();
		dif.setText("Nest");

		TextField nameText = new TextField();
		TextField by = new TextField();
		Choice cc = new Choice();
		cc.addItem("RGB");
		cc.addItem("Gray");
		Choice cd = new Choice();
		cd.addItem("Low");
		cd.addItem("Mediem");
		cd.addItem("High");

		bar2.add(name);
		bar2.add(nameText);
		bar2.add(cname);
		bar2.add(by);
		bar2.add(color);
		bar2.add(cc);
		bar2.add(dif);
		bar2.add(cd);

		return bar2;
	}

	private JButton generateBut() {
		JButton but = new JButton("Generate");

		return but;
	}

	private JPanel setOutputLabel() {
		JPanel labelOutput = new JPanel();
		Border title = BorderFactory.createTitledBorder("Function Log");
		((TitledBorder) title).setTitleJustification(TitledBorder.LEFT);
		labelOutput.setBorder(title);

		TextArea text = new TextArea(2, 80);
		text.setEditable(false);
		text.setBackground(Color.black);
		labelOutput.add(text);

		return labelOutput;
	}

}
