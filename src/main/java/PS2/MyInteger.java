package PS2;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	public boolean isEven() {
		if (this.iValue % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isOdd() {
		if (this.iValue % 2 != 0) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isPrime() {
		boolean flag = true;
		for (int i = 2; i <= this.iValue / 2; i++) {
			if (this.iValue % i == 0) {
				flag = false;
			}else {
				flag = true;
			}
		}
		return flag;
	}
	public static boolean isEven(int speciValue) {
		if (speciValue % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isOdd(int speciValue) {
		if (speciValue % 2 != 0) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isPrime(int speciValue) {
		boolean flag = true;
		for (int i = 2; i <= speciValue / 2; i++) {
			if (speciValue % i == 0) {
				flag = false;
			}else {
				flag = true;
			}
		}
		return flag;
	}
	public static boolean isEven(MyInteger speciValue) {
		if (speciValue.getiValue() % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isOdd(MyInteger speciValue) {
		if (speciValue.getiValue() % 2 != 0) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isPrime(MyInteger speciValue) {
		boolean flag = true;
		for (int i = 2; i <= speciValue.getiValue() / 2; i++) {
			if (speciValue.getiValue() % i == 0) {
				flag = false;
			}else {
				flag = true;
			}
		}
		return flag;
	}
	public boolean equals(int speciValue) {
		if (speciValue == this.iValue) {
			return true;
		}else {
			return false;
		}
	}
	public boolean equals(MyInteger speciValue) {
		if (speciValue.getiValue() == this.iValue) {
			return true;
		}else {
			return false;
		}
	}

}
