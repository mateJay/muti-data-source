package com.matej.multidatasource.repository.db2;

import com.matej.multidatasource.entity.db2.Db2UserEntity;

public interface Db2UserDao {
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
    int insert(Db2UserEntity record);

    /**
     *
     * @param record
     */
    int insertSelective(Db2UserEntity record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    Db2UserEntity selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Db2UserEntity record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Db2UserEntity record);
}