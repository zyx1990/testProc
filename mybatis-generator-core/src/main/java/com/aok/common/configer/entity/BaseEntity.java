/*
 * 
 * 
 * 
 */
package com.aok.common.configer.entity;

import java.io.Serializable;
import java.util.Date;

//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.MappedSuperclass;
//import javax.persistence.PrePersist;
//import javax.persistence.PreUpdate;
//
//import com.aok.common.utils.PublicPrincipal;
//import com.aok.common.utils.WebUserUtils;
//import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Entity - 基类
 */
//@MappedSuperclass
public abstract class BaseEntity extends AbstractBaseEntity implements Serializable {

	private static final long serialVersionUID = -67188388306700736L;

	/** "ID"属性名称 */
	public static final String ID_PROPERTY_NAME = "id";

	/** ID */
	private Long id;

	/** 操作者 */
	private Long operator;

	/**
	 * 获取ID
	 * @return ID
	 */
//	@JsonProperty
////	@DocumentId
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	// Oracle: @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequenceGenerator")
	// @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequenceGenerator")
	public Long getId() {
		return id;
	}

	/**
	 * 设置ID
	 * @param id ID
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 重写equals方法
	 * @param obj 对象
	 * @return 是否相等
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (!BaseEntity.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		BaseEntity other = (BaseEntity) obj;
		return getId() != null ? getId().equals(other.getId()) : false;
	}

	/**
	 * 获取 操作者
	 * @return operator
	 */
//	@Column(name = "operator",updatable=false)
	public Long getOperator() {
		return operator;
	}

	/**
	 * 设置 操作者
	 * @param operator 操作者
	 */
	public void setOperator(Long operator) {
		this.operator = operator;
	}

	/**
	 * 重写hashCode方法
	 * @return hashCode
	 */
	@Override
	public int hashCode() {
		int hashCode = 17;
		hashCode += null == getId() ? 0 : getId().hashCode() * 31;
		return hashCode;
	}

//	@PrePersist
	public void persist() {
		this.setCreateDate(new Date());
		this.setModifyDate(new Date());
//		PublicPrincipal principal = WebUserUtils.getPublicPrincipal();
//		if (principal != null) {
//			//BeanWrapper beanWrapper = new BeanWrapperImpl(this);
//			//if(beanWrapper.isWritableProperty("operator")){
//				//beanWrapper.setPropertyValue("operator", );
//				this.setOperator(principal.getUserId());
//			//}
//		}
	}

//	@PreUpdate
	public void update() {
		this.setModifyDate(new Date());
//		Principal principal = WebUtils.getPrincipal();
//		if (principal != null) {
//			BeanWrapper beanWrapper = new BeanWrapperImpl(this);
//			if(beanWrapper.isWritableProperty("operator")){
//				beanWrapper.setPropertyValue("operator", principal.getId());
//			}
//		}
	}
}