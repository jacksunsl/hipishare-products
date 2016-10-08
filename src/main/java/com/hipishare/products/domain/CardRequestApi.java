package com.hipishare.products.domain;

public class CardRequestApi {
	private String cardNum;// 卡号
	private int pageNum;// 页码
	private int pageSize;// 页大小
	private String telNum;// 电话号码
	private Double rechargeAmt;// 充值金额
	private String merchantNo;// 商户号
	private Double amount;// 消费金额
	private String orderNo;// 订单号
	private String orgNo;// 机构号
	private String updateTime;// 商家logo修改最后时间（格式yyyyMMddHHmmss）
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getTelNum() {
		return telNum;
	}
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	public Double getRechargeAmt() {
		return rechargeAmt;
	}
	public void setRechargeAmt(Double rechargeAmt) {
		this.rechargeAmt = rechargeAmt;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrgNo() {
		return orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
}
