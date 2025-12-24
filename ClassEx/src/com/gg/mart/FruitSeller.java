package com.gg.mart;

public class FruitSeller {
	private int numOfApple;
	int myMoney;
	final int APPLE_PRICE;

	public FruitSeller(int numOfApple, int myMoney, int aPPLE_PRICE) {
		this.numOfApple = numOfApple;
		this.myMoney = myMoney;
		APPLE_PRICE = aPPLE_PRICE;
	}

	// (외부용)
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		myMoney += money;
		numOfApple -= num;
		showSaleResult();
		return num;
	}

	// (내부용)
	private void showSaleResult() {
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}

}
