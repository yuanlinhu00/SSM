package com.lh.ssm.util;

import java.util.List;

/**
 * 向前端返回的json消息体
 *
 */
public class JsonResult<T> {
	private boolean status = true; //返还状态
	private String msg; //返回信息
	private int totalPage; //分页总页数
	private List<T> data;
	private int limit;// 每页显示条数
	
	public static JsonResult<?> getEmptyData(){
		JsonResult<?> j = new JsonResult<Object>(true);
		j.setTotalPage(0);
		return j;
	}
	
	public static JsonResult<?> getFalseResult(){
		return new JsonResult<Object>(false);
	}
	
	public JsonResult(){};
	
	public JsonResult(boolean status){
		this.status = status;
	};
	
	public JsonResult(List<T> data){
		this.data = data;
	}
	
	public JsonResult(int totalPage, List<T> data, int limit){
		this.totalPage = totalPage;
		this.data = data;
		this.limit = limit;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	
	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "JsonResult [status=" + status + ", totalPage=" + totalPage
				+ ", data=" + data + "]";
	}
	
}
