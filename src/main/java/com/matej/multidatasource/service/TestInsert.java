package com.matej.multidatasource.service;

import com.matej.multidatasource.entity.db1.Db1UserEntity;
import com.matej.multidatasource.entity.db2.Db2UserEntity;
import com.matej.multidatasource.repository.db1.Db1UserDao;
import com.matej.multidatasource.repository.db2.Db2UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TestInsert {
    @Resource
    private Db1UserDao db1UserDao;
    @Resource
    private Db2UserDao db2UserDao;

    @Transactional
    public void insert(String loginMobile) {

        Db1UserEntity db1UserEntity = new Db1UserEntity();
        db1UserEntity.setLoginMobile(loginMobile);
        db1UserDao.insertSelective(db1UserEntity);

        Db2UserEntity db2UserEntity = new Db2UserEntity();
        db2UserEntity.setLoginMobile(loginMobile);
        db2UserDao.insertSelective(db2UserEntity);

        if ("0".equals(loginMobile)) {
            int i = 1 / 0;
        }
    }

}
