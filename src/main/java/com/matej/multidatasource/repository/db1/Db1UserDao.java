package com.matej.multidatasource.repository.db1;

import com.matej.multidatasource.entity.db1.Db1UserEntity;

public interface Db1UserDao {
    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(Db1UserEntity record);

    /**
     *
     * @param record
     */
    int insertSelective(Db1UserEntity record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    Db1UserEntity selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Db1UserEntity record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Db1UserEntity record);
}