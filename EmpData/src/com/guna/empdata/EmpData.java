package com.guna.empdata;

public class EmpData {
	private int id;
	private String name;
	private String baselocation;
	private int phnumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBaselocation() {
		return baselocation;
	}
	public void setBaselocation(String baselocation) {
		this.baselocation = baselocation;
	}
	public int getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(int phnumber) {
		this.phnumber = phnumber;
	}
	@Override
	 public String toString() {
		return "EmpData [id=" + id + ", name=" + name + ", baselocation=" + baselocation + ", phnumber=" + phnumber
				+ "]"; //
	}
	
} 
