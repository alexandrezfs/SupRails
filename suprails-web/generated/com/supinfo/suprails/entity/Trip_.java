package com.supinfo.suprails.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Trip.class)
public abstract class Trip_ {

	public static volatile SingularAttribute<Trip, TrainStation> arrivalStation;
	public static volatile SingularAttribute<Trip, Long> id;
	public static volatile SingularAttribute<Trip, BigDecimal> price;
	public static volatile SingularAttribute<Trip, TrainStation> departureStation;

}

