package com.supinfo.suprails.dao;

import com.supinfo.suprails.entity.CustomerOrder;

import javax.ejb.Local;

/**
 * Created by Alexandre NGUYEN on 12/10/2014.
 */
@Local
public interface CustomerOrderDao {

    void addCustomerOrder(CustomerOrder customerOrder);
}
