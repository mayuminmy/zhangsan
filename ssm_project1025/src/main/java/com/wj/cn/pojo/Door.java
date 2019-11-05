
    /**  
    * @Title: Door.java
    * @Package com.wj.cn.pojo
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author Mashiroins
    * @date 2019��10��10������4:36:25
    * @version V1.0  
    */
    
package com.wj.cn.pojo;

import java.io.Serializable;

/**
    * @ClassName: Door
    * @Description: �����ŵ��tb_doorӳ��ʵ�������ʵ��ORM
    * @author Mashiroins
    * @date 2019��10��10������4:36:25
    * @version:1.0
    */

public class Door extends BasePojo implements Serializable {
	
	    /**
	    * @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô)
	    */
	    
	private static final long serialVersionUID = 1L;
	//���ݱ���ֶη�װ����
	private String doorName; //��tb_door���doorName�ֶζ�Ӧ
	private String tel;		 //��tb_door���tel�ֶζ�Ӧ

	
	/**
	* @return doorName
	*/
	
	public String getDoorName() {
		return doorName;
	}
	
	/**
	 * @param doorName the doorName to set
	 */
	
	public void setDoorName(String doorName) {
		this.doorName = doorName;
	}
	
	/**
	* @return tel
	*/
	
	public String getTel() {
		return tel;
	}
	
	/**
	 * @param tel the tel to set
	 */
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	/**
	* @return serialversionuid
	*/
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	    /* (�� Javadoc)
	    * <p>Title: toString</p>
	    * <p>Description: </p>
	    * @return
	    * @see java.lang.Object#toString()
	    */
	    
	@Override
	public String toString() {
		return "Door [doorName=" + doorName + ", tel=" + tel + "]";
	}
	
	
	
	

	
	

}
