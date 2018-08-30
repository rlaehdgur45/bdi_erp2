package com.bdi.mvc.vo;

public class GameChart {

	private int gcnum;
	private String gcname;
	private int gcprice;
	private int gcvendor;
	private int gcorder;
	private String gcdesc;
	private String gcimg;
	
	public GameChart(Integer gcnum, String gcname, Integer gcprice, Integer gcvendor, Integer gcorder, String gcdesc,
			String gcimg) {
		super();
		this.gcnum = gcnum;
		this.gcname = gcname;
		this.gcprice = gcprice;
		this.gcvendor = gcvendor;
		this.gcorder = gcorder;
		this.gcdesc = gcdesc;
		this.gcimg = gcimg;
	}
	
	@Override
	public String toString() {
		return "GameChart [gcnum=" + gcnum + ", gcname=" + gcname + ", gcprice=" + gcprice + ", gcvendor=" + gcvendor
				+ ", gcorder=" + gcorder + ", gcdesc=" + gcdesc + ", gcimg=" + gcimg + "]";
	}
	public Integer getGcnum() {
		return gcnum;
	}
	public void setGcnum(Integer gcnum) {
		this.gcnum = gcnum;
	}
	public String getGcname() {
		return gcname;
	}
	public void setGcname(String gcname) {
		this.gcname = gcname;
	}
	public Integer getGcprice() {
		return gcprice;
	}
	public void setGcprice(Integer gcprice) {
		this.gcprice = gcprice;
	}
	public Integer getGcvendor() {
		return gcvendor;
	}
	public void setGcvendor(Integer gcvendor) {
		this.gcvendor = gcvendor;
	}
	public Integer getGcorder() {
		return gcorder;
	}
	public void setGcorder(Integer gcorder) {
		this.gcorder = gcorder;
	}
	public String getgcdesc() {
		return gcdesc;
	}
	public void setgcdesc(String gcdesc) {
		this.gcdesc = gcdesc;
	}
	public String getGcimg() {
		return gcimg;
	}
	public void setGcimg(String gcimg) {
		this.gcimg = gcimg;
	}
	
	
	
}
