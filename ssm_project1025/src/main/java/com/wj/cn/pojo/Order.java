
/**  
 * @Title: Order.java
 * @Package com.wj.cn.pojo
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Mashiroins
 * @date 2019��10��12������3:23:07
 * @version V1.0  
 */

package com.wj.cn.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @ClassName: Order
 * @Description: ����ORM��ϵ,��tb_order
 * @author Mashiroins
 * @date 2019��10��12������3:23:07
 * @version:1.0
 */	
//����������
public class Order extends BasePojo implements Serializable{
	
	    /**
	    * @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô)
	    */
	    
	private static final long serialVersionUID = 1L;

	//id�ֶ�
		private Integer id;
		
		//door_id�ֶ�
		private Integer doorId;
		
		//order_no�ֶ�
		private String orderNo;
		
		//order_type�ֶ�
		private String orderType;
		
		//person_num�ֶ�
		private Integer personNum;
		
		//cashier�ֶ�
		private String cashier;
		
		//create_time�ֶ�
		@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
		private Date createdTime;
		
		//end_time�ֶ�
		@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
		private Date endTime;
		
		//payment_type�ֶ�
		private String paymentType;
		
		//price�ֶ�
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

	


