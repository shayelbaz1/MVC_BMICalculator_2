
public class Model {
	public double BMI = 0;
	public double EER = 0;

	public void caculateBMI(int weight, int height) {
		if (weight == 0 || height == 0) {
			BMI = 0;
		} else
			BMI = (1.3 * weight) / Math.pow((double) height / 100, 2.5);
	}

	public void caculateERRmale(int weight, int height, double PA, int age) {
		if (age == 0 || weight == 0 || height == 0) {
			EER = 0;
		} else
			EER = (662 - (9.53 * age)) + (PA * ((15.91 * weight) + (539.6 * ((double) height / 100))));
	}

	public void caculateERRfemale(int weight, int height, double PA, int age) {
		EER = (354 - (6.91 * age)) + (PA * ((9.36 * weight) + (726 * ((double) height / 100))));
	}

	public double getBMI() {
		return BMI;
	}

	public double getEER() {
		return EER;
	}

	public String calculateWS() {
		if(BMI==0) {
			return "";
		}
		else if (BMI < 15) {
			return "Anorexic";
		} else if (15 < BMI && BMI < 18.5) {
			return "Underweight";
		} else if (18.5 < BMI && BMI < 24.9) {
			return "Normal";
		} else if (25.0 < BMI && BMI < 29.9) {
			return "Overweight";
		} else if (30.0 < BMI && BMI < 35.0) {
			return "Obese";
		} else if (35 < BMI) {
			return "Extreme Obese";
		}
		return "null";
	}
}
