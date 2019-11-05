
/**  
 * @Title: OrderService.java
 * @Package com.wj.cn.service
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Mashiroins
 * @date 2019��10��12������3:36:57
 * @version V1.0  
 */

package com.wj.cn.service;

import java.util.List;

import com.wj.cn.pojo.Order;

/**
 * @ClassName: OrderService
 * @Description: ����ģ��ҵ���ӿ�
 * @author Mashiroins
 * @date 2019��10��12������3:36:57
 * @version:1.0
 */

public interface OrderService {
	//��ѯ���ж�����Ϣ
	public List<Order> findOrders();

	//��������
	public void addOrders(Order order);

	//��ѯһ������
	public Order SelectOneOrder(Integer id);
	
	//�޸Ķ���
	public void update(Order order);
	
	//ɾ������
	public void delete(Integer id);

}
