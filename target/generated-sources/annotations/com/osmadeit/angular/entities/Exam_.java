package com.osmadeit.angular.entities;

import com.osmadeit.angular.entities.Result;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-17T10:46:28")
@StaticMetamodel(Exam.class)
public class Exam_ { 

    public static volatile SingularAttribute<Exam, String> name;
    public static volatile SingularAttribute<Exam, Integer> id;
    public static volatile ListAttribute<Exam, Result> resultList;

}