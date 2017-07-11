package com.gaurav.dataTable;
import java.util.List;

import com.gaurav.bean.RegisterUser;

public class DataTableParameters {
	int iTotalRecords;
    int iTotalDisplayRecords;
    String sEcho;
    String sColumns;
    List<RegisterUser> aaData;
    
	public int getiTotalRecords() {
		return iTotalRecords;
	}
	public void setiTotalRecords(int iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}
	public int getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}
	public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}
	public String getsEcho() {
		return sEcho;
	}
	public void setsEcho(String sEcho) {
		this.sEcho = sEcho;
	}
	public String getsColumns() {
		return sColumns;
	}
	public void setsColumns(String sColumns) {
		this.sColumns = sColumns;
	}
	public List<RegisterUser> getAaData() {
		return aaData;
	}
	public void setAaData(List<RegisterUser> aaData) {
		this.aaData = aaData;
	}
    
}
