package com.supinfo.suprails.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CustomerOrder.class)
public abstract class CustomerOrder_ {

	public static volatile SingularAttribute<CustomerOrder, Long> id;
	public static volatile SingularAttribute<CustomerOrder, Trip> trip;
	public static volatile SingularAttribute<CustomerOrder, Customer> customer;

}

