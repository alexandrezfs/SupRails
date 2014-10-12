package com.supinfo.suprails.dao.jpa;

import com.supinfo.suprails.dao.CustomerOrderDao;
import com.supinfo.suprails.entity.CustomerOrder;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Alexandre NGUYEN on 12/10/2014.
 */
@Stateless
public class JpaCustomerOrderDao implements CustomerOrderDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addCustomerOrder(CustomerOrder customerOrder) {
        em.persist(customerOrder);
    }
}
