
/**  
 * @Title: DoorMapper.java
 * @Package com.wj.cn.mapper
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Mashiroins
 * @date 2019��10��10������4:56:42
 * @version V1.0  
 */

package com.wj.cn.mapper;

import java.util.List;

import com.wj.cn.pojo.Door;

/**
 * @ClassName: DoorMapper
 * @Description: ����ӿ���DoorMapper.xml�ļ���Ӧ
 * @author Mashiroins
 * @date 2019��10��10������4:56:42
 * @version:1.0
 */

public interface DoorMapper {

	//����ŵ���Ϣ
	public Integer addDoor(Door door);

	//��ѯ�ŵ���Ϣ
	public List<Door> findAllDoorInfo();

	//<!-- ��ѯһ���ŵ� -->
	public Door SelectOne(Integer id);


	//<!-- �޸��ŵ� now()��ȡ��ǰʱ��-->
	public void update(Door door);

	//<!-- ɾ���ŵ� -->
	public void delete(Integer id);

}
