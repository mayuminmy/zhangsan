
/**  
 * @Title: Order.java
 * @Package com.wj.cn.pojo
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Mashiroins
 * @date 2019年10月12日下午3:23:07
 * @version V1.0  
 */

package com.wj.cn.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @ClassName: Order
 * @Description: 根据ORM关系,将tb_order
 * @author Mashiroins
 * @date 2019年10月12日下午3:23:07
 * @version:1.0
 */	
//描述订单表
public class Order extends BasePojo implements Serializable{
	
	    /**
	    * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	    */
	    
	private static final long serialVersionUID = 1L;

	//id字段
		private Integer id;
		
		//door_id字段
		private Integer doorId;
		
		//order_no字段
		private String orderNo;
		
		//order_type字段
		private String orderType;
		
		//person_num字段
		private Integer personNum;
		
		//cashier字段
		private String cashier;
		
		//create_time字段
		@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
		private Date createdTime;
		
		//end_time字段
		@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
		private Date endTime;
		
		//payment_type字段
		private String paymentType;
		
		//price字段
		private Double price;
		
		//getters and setters
		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getDoorId() {
			return doorId;
		}

		public void setDoorId(Integer doorId) {
			this.doorId = doorId;
		}

		public String getOrderNo() {
			return orderNo;
		}

		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}

		public String getOrderType() {
			return orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public Integer getPersonNum() {
			return personNum;
		}

		public void setPersonNum(Integer personNum) {
			this.personNum = personNum;
		}

		public String getCashier() {
			return cashier;
		}

		public void setCashier(String cashier) {
			this.cashier = cashier;
		}

		public Date getCreatedTime() {
			return createdTime;
		}

		public void setCreatedTime(Date createdTime) {
			this.createdTime = createdTime;
		}

		public Date getEndTime() {
			return endTime;
		}

		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}

		public String getPaymentType() {
			return paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}
		
		
		//toString
			
		@Override
		public String toString() {
			return "Order [id=" + id + ", doorId=" + doorId + ", orderNo=" + orderNo + ", orderType=" + orderType
					+ ", personNum=" + personNum + ", cashier=" + cashier + ", createdTime=" + createdTime + ", endTime="
					+ endTime + ", paymentType=" + paymentType + ", price=" + price + "]";
		}
		
		
		
		
		
	}

	


