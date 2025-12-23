package com.gg.classex;

public class Triangle {
	int high;
	int baseline;

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getBaseline() {
		return baseline;
	}

	public void setBaseline(int baseline) {
		this.baseline = baseline;
	}

	@Override
	public String toString() {
		return "triangle [높이 :" + high + ", 밑변 :" + baseline + "]";
	}

}
