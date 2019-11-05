
    /**  
    * @Title: OrderMapper.java
    * @Package com.wj.cn.mapper
    * @Description: TODO(用一句话描述该文件做什么)
    * @author Mashiroins
    * @date 2019年10月12日下午3:31:42
    * @version V1.0  
    */
    
package com.wj.cn.mapper;

import java.util.List;

import com.wj.cn.pojo.Order;

/**
    * @ClassName: OrderMapper
    * @Description: 订单模块持久层
    * @author Mashiroins
    * @date 2019年10月12日下午3:31:42
    * @version:1.0
    */

public interface OrderMapper {
	//查询所有订单信息
	public List<Order> findAllOrder();
	
	//新增订单
	public void addOrder(Order order);
	
	//查询一个订单
	public Order SelectOneOrder(Integer id);
	
	//修改订单
	public void update(Order order);
	
	//删除订单
	public void delete(Integer id);
		

}
