package com.huilong.oa.dao.impl;

import com.huilong.oa.dao.UserDao;
import com.huilong.oa.entity.UserEntity;
import com.huilong.oa.util.Hibernate5CustomTemplate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository("userDao")


public class UserDaoImpl  implements UserDao {

    private HibernateTemplate hibernateTemplate;
    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    @Override
    public void save(UserEntity userEntity) {
           hibernateTemplate.save(userEntity);
    }

/*@Autowired(required = true)
private SessionFactory sessionFactory;
    @Override
    public void save(UserEntity userEntity) {
        Session session=sessionFactory.openSession();
        session.save(userEntity);
    }*/



}
