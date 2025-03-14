package org.dspace.eperson;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(RegistrationData.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class RegistrationData_ {

	
	/**
	 * @see org.dspace.eperson.RegistrationData#expires
	 **/
	public static volatile SingularAttribute<RegistrationData, Date> expires;
	
	/**
	 * @see org.dspace.eperson.RegistrationData#id
	 **/
	public static volatile SingularAttribute<RegistrationData, Integer> id;
	
	/**
	 * @see org.dspace.eperson.RegistrationData
	 **/
	public static volatile EntityType<RegistrationData> class_;
	
	/**
	 * @see org.dspace.eperson.RegistrationData#email
	 **/
	public static volatile SingularAttribute<RegistrationData, String> email;
	
	/**
	 * @see org.dspace.eperson.RegistrationData#token
	 **/
	public static volatile SingularAttribute<RegistrationData, String> token;

	public static final String EXPIRES = "expires";
	public static final String ID = "id";
	public static final String EMAIL = "email";
	public static final String TOKEN = "token";

}

