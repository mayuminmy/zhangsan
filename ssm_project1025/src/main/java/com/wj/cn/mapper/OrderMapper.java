
    /**  
    * @Title: OrderMapper.java
    * @Package com.wj.cn.mapper
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author Mashiroins
    * @date 2019��10��12������3:31:42
    * @version V1.0  
    */
    
package com.wj.cn.mapper;

import java.util.List;

import com.wj.cn.pojo.Order;

/**
    * @ClassName: OrderMapper
    * @Description: ����ģ��־ò�
    * @author Mashiroins
    * @date 2019��10��12������3:31:42
    * @version:1.0
    */

public interface OrderMapper {
	//��ѯ���ж�����Ϣ
	public List<Order> findAllOrder();
	
	//��������
	public void addOrder(Order order);
	
	//��ѯһ������
	public Order SelectOneOrder(Integer id);
	
	//�޸Ķ���
	public void update(Order order);
	
	//ɾ������
	public void delete(Integer id);
		

}
