import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controller {
	View view;
	Model model;

	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
		
		this.view.addViewListener(new ViewListener());
		this.view.addChangedListener(new changedListenerClass());
	}
	
	
	class changedListenerClass implements ChangeListener
	{
		public void stateChanged(ChangeEvent e) {
			view.setAgeLabel(view.getSliderAge());
			view.setHeightLabel(view.getSliderHeight());
		}
	}


	class ViewListener implements ActionListener

	{
		public void actionPerformed(ActionEvent e) 
		{

			try {
				if(e.getSource()==view.getBottunClear()) {
					view.clearAll();
				}
				else {
				boolean male = view.getrdbtnMale();
				boolean female = view.getrbtFemale();
				int age = view.getSliderAge();
				int weight = view.getWeight();
				int height = view.getSliderHeight();
				double PA = view.getBtnGroupPA();
				System.out.println(PA);
				String bodyFrame = view.getBtnGroupBodyFrame();
				
				view.setHeightLabel(height);
				view.setAgeLabel(age);
				
				model.caculateBMI(weight, height);
				if(male) 
					model.caculateERRmale(weight, height, PA, age);
				else if(female)
					model.caculateERRfemale(weight, height, PA, age);
				
				view.setLabelBMI(model.getBMI());
				view.setLabelEER(model.getEER());
				view.setWeightStatus(model.calculateWS());
				
				}
			}

			catch (Exception ex) {
				System.out.println(ex);

				view.displayErrorMessage("Please fill all the fields");
			}
		}
		
		
	}
}
