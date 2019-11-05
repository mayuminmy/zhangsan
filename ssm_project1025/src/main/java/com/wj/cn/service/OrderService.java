
/**  
 * @Title: OrderService.java
 * @Package com.wj.cn.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Mashiroins
 * @date 2019年10月12日下午3:36:57
 * @version V1.0  
 */

package com.wj.cn.service;

import java.util.List;

import com.wj.cn.pojo.Order;

/**
 * @ClassName: OrderService
 * @Description: 订单模块业务层接口
 * @author Mashiroins
 * @date 2019年10月12日下午3:36:57
 * @version:1.0
 */

public interface OrderService {
	//查询所有订单信息
	public List<Order> findOrders();

	//新增订单
	public void addOrders(Order order);

	//查询一个订单
	public Order SelectOneOrder(Integer id);
	
	//修改订单
	public void update(Order order);
	
	//删除订单
	public void delete(Integer id);

}
