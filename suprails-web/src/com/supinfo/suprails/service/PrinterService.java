package com.supinfo.suprails.service;

import com.supinfo.suprails.entity.CustomerOrder;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jms.*;

/**
 * Created by Alexandre NGUYEN on 13/10/2014.
 */

@Stateless
public class PrinterService {

    @Resource(mappedName = "ConnectionFactory")
    private ConnectionFactory cFactory;

    @Resource(mappedName = "queue/printer")
    private Destination destination;

    public void print(CustomerOrder customerOrder) {

        try {
            Connection connection = cFactory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(destination);
            TextMessage textMessage = session.createTextMessage();

            textMessage.setText(buildMessage(customerOrder));

            messageProducer.send(textMessage);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    private String buildMessage(CustomerOrder customerOrder) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ORDER:").append("\n");
        stringBuilder.append("DEPARTURE: ").append(customerOrder.getTrip().getDepartureStation().getName()).append("\n");
        stringBuilder.append("ARRIVAL: ").append(customerOrder.getTrip().getArrivalStation().getName()).append("\n");
        stringBuilder.append("PRICE: ").append(customerOrder.getTrip().getPrice()).append("\n");
        stringBuilder.append("FIRSTNAME : ").append(customerOrder.getCustomer().getFirstName()).append("\n");
        stringBuilder.append("LASTNAME: ").append(customerOrder.getCustomer().getLastName()).append("\n");
        stringBuilder.append("EMAIL: ").append(customerOrder.getCustomer().getEmail()).append("\n");

        return stringBuilder.toString();
    }
}
