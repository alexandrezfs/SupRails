package com.supinfo.suprails.service;

import com.supinfo.suprails.dao.CustomerOrderDao;
import com.supinfo.suprails.entity.CustomerOrder;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Created by Alexandre NGUYEN on 12/10/2014.
 */
@Stateless
public class CustomerOrderService {

    @EJB
    private CustomerOrderDao customerOrderDao;

    @EJB
    private EmailService emailService;

    public void processCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);
        emailService.sendMail(customerOrder.getCustomer());
    }
}
