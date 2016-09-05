package com.aok.framework.mybatis.repository;


import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.aok.common.view.Page;

public interface BaseMybatisDao<T,ID extends Serializable> {
    /**
     * 根据条件查询记录总数
     */
    int count(@Param("condition") Map<String, Object> condition);

    /**
     * 根据条件删除记录
     */
    int deleteBy(@Param("condition") Map<String, Object> condition);

    /**
     * 根据主键删除记录
     */
    int delete(ID id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(T record);

    /**
     * 保存属性不为空的记录
     */
    int insertNotNull(T record);

    /**
     * 根据条件查询记录集
     */
    List<T> list(@Param("condition") Map<String, Object> condition);
    /**
     * 分页查询记录集
     */
    Page<T> list(@Param("condition") Map<String, Object> condition,RowBounds page);

    /**
     * 根据主键查询记录
     */
    T find(ID id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByNotNull(@Param("record") T record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateBy(@Param("record") T record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateNotNull(T record);

    /**
     * 根据主键更新记录
     */
    int update(T record);
}