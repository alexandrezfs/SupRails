package com.supinfo.suprails.service;

import com.supinfo.suprails.entity.Customer;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

/**
 * Created by Alexandre NGUYEN on 12/10/2014.
 */

@Stateless
public class EmailService {

    @Asynchronous
    public void sendMail(Customer customer) {

        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            throw new RuntimeException();
        }

        System.out.println("Mail sent to " + customer.getFirstName() + " " + customer.getLastName() + " TO  " + customer.getEmail());
    }

}
