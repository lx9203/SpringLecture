package com.prectice.project01.dto;

public class MemberDTO {
	private String name;
	private String tel;
	private String adress;
	
	public MemberDTO(String name, String tel, String adress) {
		super();
		this.name = name;
		this.tel = tel;
		this.adress = adress;
	}
	
	public MemberDTO() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", tel=" + tel + ", adress=" + adress + "]";
	}
	
}
