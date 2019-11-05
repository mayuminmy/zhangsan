
    /**  
    * @Title: BasePojo.java
    * @Package com.wj.cn.pojo
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author Mashiroins
    * @date 2019��10��10������4:47:37
    * @version V1.0  
    */
    
package com.wj.cn.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
    * @ClassName: BasePojo
    * @Description: TODO(������һ�仰��������������)
    * @author Mashiroins
    * @date 2019��10��10������4:47:37
    * @version:1.0
    */

public class BasePojo implements Serializable {

	
	    /**
	    * @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô)
	    */
	    
	private static final long serialVersionUID = 1L;
	private Integer id;      //��tb_door���id�ֶζ�Ӧ
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date createTime; //��tb_door���createTime�ֶζ�Ӧ
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updateTime; //��tb_door���updateTime�ֶζ�Ӧ
	
	/**
	* @return id
	*/
	
	public Integer getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	* @return createTime
	*/
	
	public Date getCreateTime() {
		return createTime;
	}
	
	/**
	 * @param createTime the createTime to set
	 */
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	/**
	* @return updateTime
	*/
	
	public Date getUpdateTime() {
		return updateTime;
	}
	
	/**
	 * @param updateTime the updateTime to set
	 */
	
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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
		return "BasePojo [id=" + id + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	
	

}
