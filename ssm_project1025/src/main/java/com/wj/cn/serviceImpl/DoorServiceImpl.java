
/**  
 * @Title: DoorServiceImpl.java
 * @Package com.wj.cn.serviceImpl
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @author Mashiroins
 * @date 2019��10��11������1:53:26
 * @version V1.0  
 */

package com.wj.cn.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wj.cn.mapper.DoorMapper;
import com.wj.cn.pojo.Door;
import com.wj.cn.service.DoorService;

/**
 * @ClassName: DoorServiceImpl
 * @Description: ҵ���ӿڵ�ʵ��
 * @author Mashiroins
 * @date 2019��10��11������1:53:26
 * @version:1.0
 */
@Service//����ҵ��㡣�������ע���Ժ������ύ��spring�������й���
//@Repository @Controller ��Щע��Ҳ���Լ���������Ϸ�������Ϊ����ȷ�����Ǵ���ʲôҵ��ģ����ԼӶ�Ӧ�����ע��
public class DoorServiceImpl implements DoorService{

	//��ҵ���ʵ�����е���Mapper�ӿڵķ���
	@Autowired
	private DoorMapper doorMapper;//���־ò����ע�뵽ҵ��㣬ʹ��@Autowriedע��

	@Override
	public Integer addDoor(Door door) {
		Integer row=0;
		//�Բ��������ж�
		if(door!=null) {
			//���ó־ò�ӿڷ���
			row=doorMapper.addDoor(door);

		}else {
			throw new RuntimeException("����д�ŵ�������Ϣ");
		}

		return row;
	}


	/* (�� Javadoc)
	 * <p>Title: findAllDoorInfo</p>
	 * <p>Description: </p>
	 * @return
	 * @see com.wj.cn.service.DoorService#findAllDoorInfo()
	 */

	@Override
	public List<Door> findAllDoorInfo() {
		// TODO Auto-generated method stub

		List<Door> list = doorMapper.findAllDoorInfo();


		return list;
	}



	/* (�� Javadoc)
	 * <p>Title: SelectOne</p>
	 * <p>Description: </p>
	 * @param id
	 * @return
	 * @see com.wj.cn.service.DoorService#SelectOne(java.lang.Integer)
	 */

	@Override
	public Door SelectOne(Integer id) {
		// TODO Auto-generated method stub
		return doorMapper.SelectOne(id);
	}



	/* (�� Javadoc)
	 * <p>Title: update</p>
	 * <p>Description: </p>
	 * @param door
	 * @see com.wj.cn.service.DoorService#update(com.wj.cn.pojo.Door)
	 */

	@Override
	public void update(Door door) {
		// TODO Auto-generated method stub
		doorMapper.update(door);
	}







	/* (�� Javadoc)
	 * <p>Title: delete</p>
	 * <p>Description: </p>
	 * @param id
	 * @see com.wj.cn.service.DoorService#delete(java.lang.Integer)
	 */

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		doorMapper.delete(id);
	}



}
