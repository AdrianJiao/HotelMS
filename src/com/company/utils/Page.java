package com.company.utils;


import java.util.ArrayList;
import java.util.List;

public class Page<T> {
	//分页记录数
	public static final int  RECEIVETARGET_PER_PAGE_RECORD_NUM = 10;
	public static final int  PASSENGER_PER_PAGE_RECORD_NUM = 10;

    //客房list每页记录数
    public static final int ROOM_PER_PAGE_RECORD_NUM = 10;

    //入住模块每页记录数
	public static final int CHCKIN_PER_PAGE_RECORD_NUM = 10;

	//预定模块每页记录数
	public static final int RRESERVE_PER_PAGE_RECORD_NUM = 10;

	//每页记录数
	private int perPageRecordNum;
	//总记录数
	private int totalRecordsNum;

	//结果集
	private List<T> result;

	//总页数
	private int totalPage;

	//当前页码数
	private int currentPage;


	//调用这个Page的构造方法
	public Page(int perPageRecordNum, int totalRecordsNum, List<T> result, int currentPage) {
		this.perPageRecordNum = perPageRecordNum;
		this.totalRecordsNum = totalRecordsNum;
		this.result = result;
		this.currentPage = currentPage;
		setTotalPage();
	}

	public int getPerPageRecordNum() {
		return perPageRecordNum;
	}

	public void setPerPageRecordNum(int perPageRecordNum) {
		this.perPageRecordNum = perPageRecordNum;
	}

	public int getTotalRecordsNum() {
		return totalRecordsNum;
	}

	public void setTotalRecordsNum(int totalRecordsNum) {
		this.totalRecordsNum = totalRecordsNum;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	//调用自己的方法
	public void setTotalPage() {
		int pageNum = totalRecordsNum / perPageRecordNum;
		this.totalPage = totalRecordsNum%perPageRecordNum==0?pageNum:pageNum+1;
	}

	@Override
	public String toString() {
		return "Page{" +
				"perPageRecordNum=" + perPageRecordNum +
				", totalRecordsNum=" + totalRecordsNum +
				", result=" + result +
				", totalPage=" + totalPage +
				", currentPage=" + currentPage +
				'}';
	}
}
