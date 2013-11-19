import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;

public class GraphicUserInterFaceGz extends JFrame {
	private CoreEngine core;
	private TextField text1, text2, text3, nameText, by;
	private JLabel main;
	private Choice cc, cd, st;
    /*
     * Constructure for create GIO of program.
     */
	public GraphicUserInterFaceGz() {
		main = new JLabel(new ImageIcon(this.getClass().getResource(
				"Image/back1.jpg")));
		setLayout(new BorderLayout());
		add(main);
		main.setLayout(new BorderLayout());
		setScreenLabel();
		setSettingLabel();
		setOutputLabel();

	}
	/*
	 *  Create main screen for random art.
	 */

	private void setScreenLabel() {
		JLabel Bitjla = new JLabel();
		Border title = BorderFactory.createTitledBorder("Image");
		((TitledBorder) title).setTitleJustification(TitledBorder.CENTER);
		JPanel labelScreen = new JPanel();
		Bitjla.setBorder(title);
		Bitjla.setPreferredSize(new Dimension(400, 200));
		Bitjla.setLayout(new FlowLayout());

		labelScreen.setPreferredSize(new Dimension(410, 330));
		core = new CoreEngine((int) (Math.random() * 8 + 4));
		labelScreen.add(core);
		Bitjla.add(labelScreen);

		main.add(Bitjla, BorderLayout.CENTER);

	}

	/**
	 * set the setting bar screen.
	 * 
	 * 
	 **/

	private void setSettingLabel() {
		JLabel labelSetting = new JLabel();
		labelSetting.setPreferredSize(new Dimension(160, 30));
		labelSetting.setLayout(new FlowLayout());
		labelSetting.add(settingBar());

		Border title = BorderFactory.createTitledBorder("Setting");
		((TitledBorder) title).setTitleJustification(TitledBorder.RIGHT);
		labelSetting.setBorder(title);
		labelSetting.add(generateBut());
		labelSetting.add(exportImage());

		main.add(labelSetting, BorderLayout.EAST);
	}

	private JPanel settingBar() {
		JPanel bar2 = new JPanel();
		bar2.setLayout(new GridLayout(5, 2, 1, 3));

		JLabel name = new JLabel();
		name.setText("Pic Name");
		JLabel cname = new JLabel();
		cname.setText("by");
		JLabel color = new JLabel();
		color.setText("Color");
		JLabel dif = new JLabel();
		dif.setText("Quality");
		JLabel sty = new JLabel();
		sty.setText("Style");

		nameText = new TextField();
		by = new TextField();
		cc = new Choice();
		cc.addItem("RGB");
		cc.addItem("Gray");
		cd = new Choice();
		cd.addItem("Low");
		cd.addItem("Mediem");
		cd.addItem("High");
		st = new Choice();
		st.addItem("Ex");
		st.addItem("Beta");
		st.addItem("Final");

		bar2.add(name);
		bar2.add(nameText);
		bar2.add(cname);
		bar2.add(by);
		bar2.add(color);
		bar2.add(cc);
		bar2.add(dif);
		bar2.add(cd);
		bar2.add(sty);
		bar2.add(st);

		return bar2;
	}
     /*
      *  Generate button for program
      */
	private JButton generateBut() {
		JButton but = new JButton(
				new ImageIcon(((new ImageIcon(this.getClass().getResource(
						"/Image/icon.jpg"))).getImage()).getScaledInstance(150,
						130, java.awt.Image.SCALE_SMOOTH)));
		but.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// ////////////////////////////////////////////////////////////////////////////////////
				if (cd.getSelectedIndex() == 0) {
					core.setStyle(2);
				} else if (cd.getSelectedIndex() == 1) {
					core.setStyle(3);
				} else if (cd.getSelectedIndex() == 2) {
					core.setStyle(4);
				}
				// /////////////////////////////////////////////////////////////////////////////////////
				if (st.getSelectedIndex() == 0) {
					core.setQuality(60, 60, 60);
				} else if (st.getSelectedIndex() == 1) {
					core.setQuality(90, 90, 90);
				} else if (st.getSelectedIndex() == 2) {
					core.setQuality(100, 100, 100);
				}
				// //////////////////////////////////////////////////////////////////////////////////////////////
				if (cc.getSelectedIndex() == 0) {
					core.setGray(false);
				} else if (cc.getSelectedIndex() == 1) {
					core.setGray(true);
				}
				// //////////////////////////////////////////////////////////////////////////////////////////////

				text1.setText("Blaze : " + core.reStringRed());
				text2.setText("Wind  : " + core.reStringGreen());
				text3.setText("Frost  : " + core.reStringBlue());

				repaint();

			}
		});
		return but;
	}
 
	/* 
	 * Export button for program.
	 */
	private JButton exportImage() {
		JButton but2 = new JButton(
				new ImageIcon(((new ImageIcon(this.getClass().getResource(
						"Image/icon2.jpg"))).getImage()).getScaledInstance(150,
						35, java.awt.Image.SCALE_SMOOTH)));
		but2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String byTemp = "";
				if (by.getText().equals("")) {
					byTemp = null;
				} else if (by.getText() != null) {
					byTemp = " by " + by.getText();
				}
				core.setName(nameText.getText(), byTemp);

				try {
					core.printc();
				} catch (IOException | AWTException e1) {

					e1.printStackTrace();

				}
				JOptionPane.showMessageDialog(null, "Your image already save.");
			}
		});
		return but2;
	}
    /**
     *  set the output Screen : function show.
     */
	private void setOutputLabel() {
		JPanel labelOutput = new JPanel();

		Border title = BorderFactory.createTitledBorder("Function");
		((TitledBorder) title).setTitleJustification(TitledBorder.LEFT);

		JLabel tempPic = new JLabel();
		tempPic.setLayout(new FlowLayout());
		tempPic.setBorder(title);
		tempPic.setPreferredSize(new Dimension(620, 110));

		labelOutput.setLayout(new GridLayout(3, 1, 1, 1));
		labelOutput.setPreferredSize(new Dimension(620, 80));

		text1 = new TextField();
		text2 = new TextField();
		text3 = new TextField();

		setTextField(text1);
		setTextField(text2);
		setTextField(text3);

		labelOutput.add(text1);
		labelOutput.add(text2);
		labelOutput.add(text3);

		tempPic.add(labelOutput);

		main.add(tempPic, BorderLayout.SOUTH);
	}

	private void setTextField(TextField text) {
		text.setBackground(new Color(51, 0, 102));
		text.setEditable(false);
		if (text == text1) {
			text.setText("Blaze : ");
			text.setForeground(Color.RED);
		} else if (text == text2) {
			text.setText("Wind  : ");
			text.setForeground(Color.GREEN);
		} else if (text == text3) {
			text.setText("Frost : ");
			text.setForeground(Color.BLUE);

		}
	}

}
