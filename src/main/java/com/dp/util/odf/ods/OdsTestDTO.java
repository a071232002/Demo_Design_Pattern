package com.dp.util.odf.ods;

public class OdsTestDTO {
	
	private String date;
	private String flightNo;
	private Integer typeA;
	private Integer typeB;
	private Integer typeC;
	private Integer total;
	
	public OdsTestDTO(String date, String flightNo, Integer typeA, Integer typeB, Integer typeC, Integer total) {
		this.date = date;
		this.flightNo = flightNo;
		this.typeA = typeA;
		this.typeB = typeB;
		this.typeC = typeC;
		this.total = total;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public Integer getTypeA() {
		return typeA;
	}

	public void setTypeA(Integer typeA) {
		this.typeA = typeA;
	}

	public Integer getTypeB() {
		return typeB;
	}

	public void setTypeB(Integer typeB) {
		this.typeB = typeB;
	}

	public Integer getTypeC() {
		return typeC;
	}

	public void setTypeC(Integer typeC) {
		this.typeC = typeC;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
	
	
}
