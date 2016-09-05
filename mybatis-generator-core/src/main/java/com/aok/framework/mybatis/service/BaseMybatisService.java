package com.aok.framework.mybatis.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import com.aok.common.view.Page;

public interface BaseMybatisService<T,ID extends Serializable> {
	
	public static final String ORDER_BY_CLAUSE="orderByClause";
	
	/**
	 * count 计数
	 * @param params
	 * @return
	 */
    int count(Map<String, Object> params);
    /**
     * 列表查询
     * 支持参数orderByClause排序 例如params.put(ORDER_BY_CLAUSE,"id desc,name asc");
     * @param params
     * @return
     */
    List<T> list(Map<String, Object> params);
    
    /**
     * 分页查询
     * @param params
     * @return
     */
    Page<T> list(Map<String, Object> params,RowBounds page);
    
    /**
     * 根据主键ID查询
     * @param id
     * @return
     */
    T find(ID id);

    /**
     * 根据主键ID删除
     * @param id
     * @return
     */
    int delete(ID id);
    /**
     * 根据条件删除
     * @param params
     * @return
     */
    int deleteBy(Map<String, Object> params);
    /**
     * 根据主键ID更新实体(所有字段)
     * @param record
     * @return
     */
    int update(T record);
    /**
     * 根据主键ID更新实体(非空字段)
     * @param record
     * @return
     */
    int updateNotNull(T record);
    /**
     * 根据条件更新所有查询结果(非空字段)
     * @param record
     * @param params
     * @return
     */
    int updateByNotNull(T record, Map<String, Object> params);
    /**
     * (作废)根据条件更新实体(所有字段)
     * @param record
     * @param params
     * @return
     */
    @Deprecated
    int updateBy(T record, Map<String, Object> params);
    /**
     * 插入记录
     * @param record
     * @return
     */
    int insert(T record);
    /**
     * 插入记录(非空字段)
     * @param record
     * @return
     */
    int insertNotNull(T record);
}