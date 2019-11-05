
    /**  
    * @Title: OrderServiceImpl.java
    * @Package com.wj.cn.serviceImpl
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author Mashiroins
    * @date 2019��10��12������3:39:08
    * @version V1.0  
    */
    
package com.wj.cn.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wj.cn.mapper.OrderMapper;
import com.wj.cn.pojo.Order;
import com.wj.cn.service.OrderService;

/**
    * @ClassName: OrderServiceImpl
    * @Description: ����ҵ���ӿ�ʵ����
    * @author Mashiroins
    * @date 2019��10��12������3:39:08
    * @version:1.0
    */
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderMapper orderMapper;//���־ò����ͨ��@Autowiredע��ע�뵽ҵ�����
	    /* (�� Javadoc)
	    * <p>Title: findOrders</p>
	    * <p>Description: </p>
	    * @return
	    * @see com.wj.cn.service.OrderService#findOrders()
	    */
	    
	@Override
	public List<Order> findOrders() {
		// TODO Auto-generated method stub
		//List<Order> list = orderMapper.findAllOrder();
		return orderMapper.findAllOrder();
	}

	
	    /* (�� Javadoc)
	    * <p>Title: addOrders</p>
	    * <p>Description: </p>
	    * @param order
	    * @see com.wj.cn.service.OrderService#addOrders(com.wj.cn.pojo.Order)
	    */
	    
	@Override
	public void addOrders(Order order) {
		// TODO Auto-generated method stub
		 orderMapper.addOrder(order);
	}


	
	    /* (�� Javadoc)
	    * <p>Title: SelectOneOrder</p>
	    * <p>Description: </p>
	    * @param id
	    * @return
	    * @see com.wj.cn.service.OrderService#SelectOneOrder(java.lang.Integer)
	    */
	    
	@Override
	public Order SelectOneOrder(Integer id) {
		// TODO Auto-generated method stub
		return orderMapper.SelectOneOrder(id);
	}


	
	    /* (�� Javadoc)
	    * <p>Title: update</p>
	    * <p>Description: </p>
	    * @param order
	    * @see com.wj.cn.service.OrderService#update(com.wj.cn.pojo.Order)
	    */
	    
	@Override
	public void update(Order order) {
		// TODO Auto-generated method stub
		orderMapper.update(order);
	}


	
	    /* (�� Javadoc)
	    * <p>Title: delete</p>
	    * <p>Description: </p>
	    * @param id
	    * @see com.wj.cn.service.OrderService#delete(java.lang.Integer)
	    */
	    
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		orderMapper.delete(id);
		
	}
	
	

}
