package com.supinfo.suprails.jms;

import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

/**
 * Created by Alexandre NGUYEN on 13/10/2014.
 */
public class JmsStarter {

    public static void main(String[] args) {

        JmsTester jmsTester = new JmsTester();
        jmsTester.test();

    }
}
