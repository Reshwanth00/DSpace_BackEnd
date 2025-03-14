package org.dspace.statistics.export;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(OpenURLTracker.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class OpenURLTracker_ {

	
	/**
	 * @see org.dspace.statistics.export.OpenURLTracker#uploadDate
	 **/
	public static volatile SingularAttribute<OpenURLTracker, Date> uploadDate;
	
	/**
	 * @see org.dspace.statistics.export.OpenURLTracker#id
	 **/
	public static volatile SingularAttribute<OpenURLTracker, Integer> id;
	
	/**
	 * @see org.dspace.statistics.export.OpenURLTracker
	 **/
	public static volatile EntityType<OpenURLTracker> class_;
	
	/**
	 * @see org.dspace.statistics.export.OpenURLTracker#url
	 **/
	public static volatile SingularAttribute<OpenURLTracker, String> url;

	public static final String UPLOAD_DATE = "uploadDate";
	public static final String ID = "id";
	public static final String URL = "url";

}

