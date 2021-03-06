package com.storm.json;

import java.io.Serializable;

public class GAPI_MAP implements Serializable {

	private String id;
	private String t;
	private String e;
	private String l;
	private String l_fix;
	private String l_cur;
	private String s;
	private String ltt;
	private String lt;
	private String lt_dts;
	private String c;
	private String c_fix;
	private String cp;
	private String cp_fix;
	private String ccol;
	private String pcls_fix;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	public String getE() {
		return e;
	}
	public void setE(String e) {
		this.e = e;
	}
	public String getL() {
		return l;
	}
	public void setL(String l) {
		this.l = l;
	}
	public String getL_fix() {
		return l_fix;
	}
	public void setL_fix(String l_fix) {
		this.l_fix = l_fix;
	}
	public String getL_cur() {
		return l_cur;
	}
	public void setL_cur(String l_cur) {
		this.l_cur = l_cur;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public String getLtt() {
		return ltt;
	}
	public void setLtt(String ltt) {
		this.ltt = ltt;
	}
	public String getLt() {
		return lt;
	}
	public void setLt(String lt) {
		this.lt = lt;
	}
	public String getLt_dts() {
		return lt_dts;
	}
	public void setLt_dts(String lt_dts) {
		this.lt_dts = lt_dts;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getC_fix() {
		return c_fix;
	}
	public void setC_fix(String c_fix) {
		this.c_fix = c_fix;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getCp_fix() {
		return cp_fix;
	}
	public void setCp_fix(String cp_fix) {
		this.cp_fix = cp_fix;
	}
	public String getCcol() {
		return ccol;
	}
	public void setCcol(String ccol) {
		this.ccol = ccol;
	}
	public String getPcls_fix() {
		return pcls_fix;
	}
	public void setPcls_fix(String pcls_fix) {
		this.pcls_fix = pcls_fix;
	}
	
	public String toString()
	{
		return id 
		+ "," +  t 
		+ "," +  e 
		+ "," +  l 
		+ "," +  l_fix 
		+ "," +  l_cur 
		+ "," +  s 
		+ "," +  ltt 
		+ "," +  lt 
		+ "," +  lt_dts 
		+ "," +  c 
		+ "," +  c_fix 
		+ "," +  cp 
		+ "," +  cp_fix 
		+ "," +  ccol 
		+ "," +  pcls_fix;
	
	}
	
	
	
}
