package da2.jmro.u1;

public class Operacion {
	 private double value1;
	  private double value2; 
	  private double result;
	  
	public double getValue1() {
		return value1;
	}
	public void setValue1(double value1) {
		this.value1 = value1;
	}
	public double getValue2() {
		return value2;
	}
	public void setValue2(double value2) {
		this.value2 = value2;
	}
	
	public double getResult() {
		return (Math.pow(value1,2)+(3*value1*value2)+(4*(Math.pow(value2, 2))))-((2*(Math.pow(value1,2)))-(value1*value2)+(3*(Math.pow(value2, 2)))-5);
		//Ecuacion numero 6: (x2+3xy+4y2)-(2x2-xy+3y2-5)
		

	}
	public void setResult(double result) {
		this.result = result;
	}
}
