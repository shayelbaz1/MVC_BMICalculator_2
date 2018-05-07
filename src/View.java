import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class View extends JFrame {
	private final ButtonGroup btnGroupBodyFrame = new ButtonGroup();
	private final ButtonGroup btnGroupGender = new ButtonGroup();
	private final ButtonGroup btnGroupPA = new ButtonGroup();

	private JRadioButton rdbtnMale = new JRadioButton("Male");
	private JRadioButton rdbtnFemale = new JRadioButton("Female");
	private JRadioButton rdbtnLazy = new JRadioButton("Lazy");
	private JRadioButton rdbtnActive = new JRadioButton("acrtive"), rdbtnVeryActive = new JRadioButton("acrtive"),
			rdbtnSmall = new JRadioButton("Small"), rdbtnMedium = new JRadioButton("Medium"),
			rdbtnLarge = new JRadioButton("Large");

	private JTextField weight = new JTextField("0", 10);

	private JLabel lblWeight = new JLabel("Actual Weight"), lblPa = new JLabel("PA"),
			lblTitle = new JLabel("BMI Calculator - Shay Elbaz"), lblAgeValue = new JLabel("0"),
			lblAge = new JLabel("Age"), lblHeightValue = new JLabel("0"), calorieSummery = new JLabel("EER Calories:"),
			BMISummery = new JLabel("BMI Value:"), lblBodyFrame = new JLabel("Body Frame"),
			weightStatus = new JLabel("Weight Status:");

	private JSlider sliderAge = new JSlider(), sliderHeight = new JSlider();

	private JButton buttonClean = new JButton("clear"), btnCalculateBmi = new JButton("BMI");
	private JLabel lblNewLabel_2 = new JLabel("lblNew_2"), labelBackround, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5,
			lblHeight = new JLabel("Height");

	View() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(325, 450);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		JPanel panelMain = new JPanel() {

			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(getBackground());
				g.fillRect(0, 0, getWidth(), getHeight());
				g.drawImage(new ImageIcon("IMG_E4.2.jpg").getImage(), 0, 0, getWidth(), getHeight(), null);

			}
		};
		panelMain.setBackground(new Color(153, 204, 153));
		
		
		JPanel agePanel = new JPanel() {

			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};

		agePanel.setOpaque(false); // background of parent will be painted first
		agePanel.setBackground(new Color(0, 0, 0, 0));

		JPanel weightPanel = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};

		weightPanel.setOpaque(false); // background of parent will be painted first
		weightPanel.setBackground(new Color(0, 0, 0, 0));

		JPanel heightPanel = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};

		heightPanel.setOpaque(false); // background of parent will be painted first
		heightPanel.setBackground(new Color(0, 0, 0, 0));

		JPanel bodyFramePanel = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};

		bodyFramePanel.setOpaque(false); // background of parent will be painted first
		bodyFramePanel.setBackground(new Color(0, 0, 0, 0));
		JPanel genderPanel = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};

		genderPanel.setOpaque(false); // background of parent will be painted first
		genderPanel.setBackground(new Color(0, 0, 0, 0));

		JPanel PA = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};

		PA.setOpaque(false); // background of parent will be painted first
		PA.setBackground(new Color(0, 0, 0, 0));
		JPanel calculatePanel = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};

		calculatePanel.setOpaque(false); // background of parent will be painted first
		calculatePanel.setBackground(new Color(0, 0, 0, 0));

		JPanel summeryPanel = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.setColor(getBackground());
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};

		summeryPanel.setOpaque(false); // background of parent will be painted first
		summeryPanel.setBackground(new Color(0, 0, 0, 0));

		// panelMain.setBackground(Color.LIGHT_GRAY);
		// agePanel.transferFocusBackward();

		btnGroupGender.add(rdbtnFemale);
		btnGroupGender.add(rdbtnMale);

		genderPanel.setPreferredSize(new Dimension(200, 55));
		genderPanel.add(lblTitle, BorderLayout.NORTH);
		genderPanel.add(rdbtnMale, BorderLayout.WEST);
		genderPanel.add(rdbtnFemale, BorderLayout.WEST);

		sliderAge.setMaximum(120);
		sliderAge.setMinimum(0);
		sliderAge.setValue(0);
		sliderAge.setPaintTicks(true);
		sliderAge.setMajorTickSpacing(20);
		sliderAge.setMinorTickSpacing(5);
		sliderAge.setPaintTicks(true);
		sliderAge.setPaintLabels(true);

		agePanel.add(lblAge);
		agePanel.add(lblAgeValue);
		agePanel.add(sliderAge);

		sliderHeight.setMaximum(250);
		sliderHeight.setMinimum(0);
		sliderHeight.setValue(0);
		sliderHeight.setPaintTicks(true);
		sliderHeight.setMajorTickSpacing(50);
		sliderHeight.setMinorTickSpacing(20);
		sliderHeight.setPaintTicks(true);
		sliderHeight.setPaintLabels(true);

		heightPanel.add(lblHeight);
		heightPanel.add(lblHeightValue);
		heightPanel.add(sliderHeight);

		weightPanel.add(lblWeight);
		weightPanel.add(weight);

		btnGroupBodyFrame.add(rdbtnLazy);
		btnGroupBodyFrame.add(rdbtnActive);
		btnGroupBodyFrame.add(rdbtnVeryActive);

		bodyFramePanel.add(lblBodyFrame);
		bodyFramePanel.add(rdbtnLazy);
		bodyFramePanel.add(rdbtnActive);
		bodyFramePanel.add(rdbtnVeryActive);

		rdbtnSmall.setActionCommand("Small");
		rdbtnMedium.setActionCommand("Medium");
		rdbtnLarge.setActionCommand("Large");
		btnGroupPA.add(rdbtnSmall);
		btnGroupPA.add(rdbtnMedium);
		btnGroupPA.add(rdbtnLarge);

		PA.add(lblPa);
		PA.add(rdbtnSmall);
		PA.add(rdbtnMedium);
		PA.add(rdbtnLarge);

		btnCalculateBmi.setSize(100, 10);
		buttonClean.setSize(100, 10);

		calculatePanel.setPreferredSize(new Dimension(250, 30));
		calculatePanel.add(btnCalculateBmi);
		calculatePanel.add(buttonClean);

		summeryPanel.setLayout(new BorderLayout());
		// summeryPanel.setBackground(Color.BLUE);
		summeryPanel.setPreferredSize(new Dimension(200, 60));
		// summeryPanel.add(BMILabel, BorderLayout.NORTH);
		summeryPanel.add(BMISummery, BorderLayout.NORTH);
		// summeryPanel.add(EERLabel, BorderLayout.CENTER);
		summeryPanel.add(calorieSummery, BorderLayout.CENTER);
		// summeryPanel.add(weightStatusTitle, BorderLayout.SOUTH);
		summeryPanel.add(weightStatus, BorderLayout.SOUTH);

		panelMain.add(genderPanel);
		panelMain.add(agePanel);
		panelMain.add(heightPanel);
		panelMain.add(weightPanel);
		panelMain.add(bodyFramePanel);
		panelMain.add(PA);
		panelMain.add(calculatePanel);
		panelMain.add(summeryPanel);
		this.add(panelMain);

	}

	public void setWeightStatus(String str) {
		weightStatus.setText("Weight Status: " + str);
	}

	public boolean getrdbtnMale() {
		return rdbtnMale.isSelected();
	}

	public boolean getrbtFemale() {
		return rdbtnFemale.isSelected();
	}

	public int getSliderAge() {
		return sliderAge.getValue();
	}

	public void addViewListener(ActionListener listenForView) {
		btnCalculateBmi.addActionListener(listenForView);
		buttonClean.addActionListener(listenForView);
	}

	public void addChangedListener(ChangeListener l) {
		sliderAge.addChangeListener(l);
		sliderHeight.addChangeListener(l);
	}

	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

	public int getWeight() {
		return Integer.parseInt(weight.getText());
	}

	public int getSliderHeight() {
		return sliderHeight.getValue();
	}

	public double getBtnGroupPA() {
		String BC = btnGroupPA.getSelection().getActionCommand();
		if (BC == "Small")
			return 1.0;
		else if (BC == "Medium")
			return 1.27;
		else if (BC == "Large")
			return 1.45;
		else
			return 0;
	}

	public String getBtnGroupBodyFrame() {
		int BC = btnGroupBodyFrame.getButtonCount();
		if (BC == 1)
			return "small";
		else if (BC == 2)
			return "medium";
		else if (BC == 3)
			return "Large";
		else
			return "";
	}

	public void setHeightLabel(int height) {
		String str = Integer.toString(height);
		lblHeightValue.setText(str);
	}

	public void setAgeLabel(int age) {
		String str = Integer.toString(age);
		lblAgeValue.setText(str);
	}

	public void setLabelBMI(double labelBMI2) {
		DecimalFormat df = new DecimalFormat("#.00");
		BMISummery.setText("BMI Value: " + df.format(labelBMI2));
	}

	public void setLabelEER(double labelEER) {
		DecimalFormat df = new DecimalFormat("#.00");
		this.calorieSummery.setText("EER Calories: " + df.format(labelEER));
	}

	public Object getBottunClear() {
		return buttonClean;
	}

	public void clearAll() {
		btnGroupBodyFrame.clearSelection();
		btnGroupGender.clearSelection();
		btnGroupPA.clearSelection();
		weight.setText("0");
		lblHeightValue.setText("0");
		sliderAge.setValue(0);
		sliderHeight.setValue(0);
		BMISummery.setText("BMI Value:");
		calorieSummery.setText("EER Calories:");
		weightStatus.setText("Weight Status: ");
	}
}
