package calculadora;

public class Calculadora {
	private int num1;
	private int num2;
	
	public Calculadora (int a, int b) {
		num1 = a;
		num2 = b;
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int suma() {
		int resul =  num1+num2;
		return resul;
	}

	public int resta() {
		int resul =  num1-num2;
		return resul;
	}
	
	public int multiplica() {
		int resul =  num1*num2;
		return resul;
	}
	
	public double divide() {
		int resul =  num1/num2;
		return resul;
	}
	
	public int divide0() {
		if (num2 == 0)
			throw new java.lang.ArithmeticException("división por 0");
		else {					
		int resul =  num1/num2;
		return resul;
		}
	}
	
}
