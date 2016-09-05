package com.aok.framework.mybatis.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.aok.common.view.Page;
import com.aok.framework.mybatis.repository.BaseMybatisDao;

@Transactional
public abstract class BaseMybatisServiceImpl<T,ID extends Serializable> implements BaseMybatisService<T,ID> {

	private static final Logger logger = LoggerFactory.getLogger(BaseMybatisServiceImpl.class);
	
	@Autowired
	protected BaseMybatisDao<T,ID> dao;
    
//    public void setdao(Basedao<T,ID> dao){
//    	this.dao=dao;
//    }

	@Transactional(readOnly=true)
    public int count(Map<String, Object> params) {
        int count = dao.count(params);
        logger.debug("count: {}", count);
        return count;
    }

	@Transactional(readOnly=true)
    public T find(ID id) {
        return dao.find(id);
    }

	@Transactional(readOnly=true)
    public List<T> list(Map<String, Object> params) {
        return dao.list(params);
    }
    
	@Transactional(readOnly=true)
    public Page<T> list(Map<String, Object> params,RowBounds page) {
    	return dao.list(params,page);
    }

    public int delete(ID id) {
        return dao.delete(id);
    }
    
    public int deleteBy(Map<String, Object> params) {
        return dao.deleteBy(params);
    }

    public int update(T record) {
        return dao.update(record);
    }
    
    public int updateNotNull(T record) {
        return dao.updateNotNull(record);
    }

    public int updateByNotNull(T record, Map<String, Object> params) {
        return dao.updateByNotNull(record, params);
    }

    @Deprecated
    public int updateBy(T record, Map<String, Object> params) {
        return dao.updateBy(record, params);
    }

    public int insert(T record) {
        return dao.insert(record);
    }

    public int insertNotNull(T record) {
        return dao.insertNotNull(record);
    }
}