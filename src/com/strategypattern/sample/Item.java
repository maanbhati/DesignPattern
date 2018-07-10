package com.strategypattern.sample;

public class Item {
	private String mUpcCode;
	private int mPrice;

	public Item(String upc, int cost) {
		this.mUpcCode = upc;
		this.mPrice = cost;
	}

	public String getUpcCode() {
		return mUpcCode;
	}

	public int getPrice() {
		return mPrice;
	}
}
