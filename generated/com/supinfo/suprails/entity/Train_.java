package com.supinfo.suprails.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Train.class)
public abstract class Train_ {

	public static volatile SingularAttribute<Train, Long> id;
	public static volatile SingularAttribute<Train, Long> max_speed;
	public static volatile SingularAttribute<Train, Traction> traction;

}

