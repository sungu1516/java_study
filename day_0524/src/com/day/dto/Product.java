package com.day.dto;

import java.util.Date;

public class Product {
	private String prod_no;
	private String prod_name;
	private int prod_price;
	private Date prod_mf_dt;
	private String prod_detail;

	// 생성자
	public Product(String prod_no, String prod_name, int prod_price, Date prod_mf_dt, String prod_detail) {
		super();
		this.prod_no = prod_no;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.prod_mf_dt = prod_mf_dt;
		this.prod_detail = prod_detail;
	}

	public Product(String prod_no, String prod_name, int prod_price) {
		this(prod_no, prod_name, prod_price, null, null); // 위에서 만든 생성자를 호출해준다.

	}

	// toString 메서드
	@Override
	public String toString() {
		return "Product [prod_no=" + prod_no + ", prod_name=" + prod_name + ", prod_price=" + prod_price
				+ ", prod_mf_dt=" + prod_mf_dt + ", prod_detail=" + prod_detail + "]";
	}

	// Getter, Setter
	public String getProd_no() {
		return prod_no;
	}

	public void setProd_no(String prod_no) {
		this.prod_no = prod_no;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public int getProd_price() {
		return prod_price;
	}

	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}

	public Date getProd_mf_dt() {
		return prod_mf_dt;
	}

	public void setProd_mf_dt(Date prod_mf_dt) {
		this.prod_mf_dt = prod_mf_dt;
	}

	public String getProd_detail() {
		return prod_detail;
	}

	public void setProd_detail(String prod_detail) {
		this.prod_detail = prod_detail;
	}

}
