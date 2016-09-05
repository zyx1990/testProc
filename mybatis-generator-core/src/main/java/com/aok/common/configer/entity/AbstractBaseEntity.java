/*
 * 
 * 
 * 
 */
package com.aok.common.configer.entity;

import java.io.Serializable;
import java.util.Date;

//import javax.persistence.Column;
//import javax.persistence.MappedSuperclass;
//import javax.validation.groups.Default;

//import org.hibernate.search.annotations.DateBridge;
//import org.hibernate.search.annotations.Field;
//import org.hibernate.search.annotations.Index;
//import org.hibernate.search.annotations.Resolution;
//import org.hibernate.search.annotations.Store;

//import com.fasterxml.jackson.annotation.JsonAutoDetect;
//import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
//import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Entity - 基类
 * 
 * 
 * 
 */
//@JsonAutoDetect(fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
//@MappedSuperclass
public abstract class AbstractBaseEntity implements Serializable {

	private static final long serialVersionUID = 1474657526543623597L;

	/** "创建日期"属性名称 */
	public static final String CREATE_DATE_PROPERTY_NAME = "createDate";

	/** "修改日期"属性名称 */
	public static final String MODIFY_DATE_PROPERTY_NAME = "modifyDate";

	/**
	 * 保存验证组
	 */
//	public interface Save extends Default {
//
//	}
//
//	/**
//	 * 更新验证组
//	 */
//	public interface Update extends Default {
//
//	}

	/** 创建日期 */
	private Date createDate;

	/** 修改日期 */
	private Date modifyDate;

	/**
	 * 获取创建日期
	 * 
	 * @return 创建日期
	 */
//	@JsonProperty
	//@Field(store = Store.YES, index = Index.UN_TOKENIZED)
	//@DateBridge(resolution = Resolution.SECOND)
//	@Column(nullable = false, updatable = false)
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * 设置创建日期
	 * 
	 * @param createDate
	 *            创建日期
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 获取修改日期
	 * 
	 * @return 修改日期
	 */
//	@JsonProperty
	//@Field(store = Store.YES, index = Index.UN_TOKENIZED)
	//@DateBridge(resolution = Resolution.SECOND)
//	@Column(nullable = false)
	public Date getModifyDate() {
		return modifyDate;
	}

	/**
	 * 设置修改日期
	 * 
	 * @param modifyDate
	 *            修改日期
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}