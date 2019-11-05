
/**  
 * @Title: DoorService.java
 * @Package com.wj.cn.service
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Mashiroins
 * @date 2019��10��11������1:45:47
 * @version V1.0  
 */

package com.wj.cn.service;

import java.util.List;

import com.wj.cn.pojo.Door;

/**
 * @ClassName: DoorService
 * @Description: ҵ���ӿ�
 * @author Mashiroins
 * @date 2019��10��11������1:45:47
 * @version:1.0
 */

public interface DoorService {
	/*
	 * ��ҵ���ӿ��ж���ĳ��󷽷���һ�㽨������ĳ��󷽷���
	 * Mapper�ӿڵĳ��󷽷�һ�¼���
	 * ���ǣ�Ҳ���Ը�Mapper�ӿڵĳ��󷽷���һ�������
	 * 
	 * */
	//����ŵ���Ϣ
	public Integer addDoor(Door door);

	//��ѯ�ŵ���Ϣ
	public List<Door> findAllDoorInfo();
	
	//<!-- ��ѯһ���ŵ� -->
		//<select id="SelectOne"
		//resultType="cn.tedu.pojo.Door">
		public Door SelectOne(Integer id);



	//<!-- �޸��ŵ� now()��ȡ��ǰʱ��-->

	public void update(Door door);
	
	//<!-- ɾ���ŵ� -->
		//<delete id="delete">
		public void delete(Integer id);


}
