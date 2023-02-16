package com.servlet.jdbc.dto;

public class Sudents {
	private String sdu_name;
	private int Rollno;
	
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	private String father_name;
	private String sdu_class;
	private String phone;
	private String city;
	private String state;
	private String country;
	public Sudents(String sdu_name, String father_name, String sdu_class, String phone, String city, String state,
			String country) {
		super();
		this.sdu_name = sdu_name;
		this.father_name = father_name;
		this.sdu_class = sdu_class;
		this.phone = phone;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getSdu_name() {
		return sdu_name;
	}
	public void setSdu_name(String sdu_name) {
		this.sdu_name = sdu_name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getSdu_class() {
		return sdu_class;
	}
	public void setSdu_class(String sdu_class) {
		this.sdu_class = sdu_class;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Sudents() {
		super();
	}
	public int setRollno(String insertQuery) {
		// TODO Auto-generated method stub
		return 0;
	}
}
