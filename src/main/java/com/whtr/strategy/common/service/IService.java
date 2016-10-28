package com.whtr.strategy.common.service;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 通用接口
 */
@Service
public interface IService<T> {

    /**
     * @param key
     * @return
     */
    public T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);

    //TODO 其他...
}