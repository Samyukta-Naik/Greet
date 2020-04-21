package com.nttdata;

public class Product {
	@Override
	public String toString() {
		return "Product [ProdId=" + ProdId + ", ProdName=" + ProdName + ", ProdCost=" + ProdCost + ", ctgry=" + ctgry
				+ "]";
	}
	private int ProdId;
	private String ProdName;
	private double ProdCost;
	public Category ctgry;
	
	public Category getCtgry() {
		return ctgry;
	}
	public void setCtgry(Category ctgry) {
		this.ctgry = ctgry;
	}
	public int getProdId() {
		return ProdId;
	}
	public void setProdId(int prodId) {
		ProdId = prodId;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public double getProdCost() {
		return ProdCost;
	}
	public void setProdCost(double prodCost) {
		ProdCost = prodCost;
	}
	

}
