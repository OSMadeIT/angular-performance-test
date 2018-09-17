package com.osmadeit.angular.entities;

import com.osmadeit.angular.entities.Exam;
import com.osmadeit.angular.entities.Student;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-17T10:46:27")
@StaticMetamodel(Result.class)
public class Result_ { 

    public static volatile SingularAttribute<Result, Integer> chemistry;
    public static volatile SingularAttribute<Result, Integer> biology;
    public static volatile SingularAttribute<Result, Integer> totalMark;
    public static volatile SingularAttribute<Result, Integer> kiswahili;
    public static volatile SingularAttribute<Result, Integer> agriculture;
    public static volatile SingularAttribute<Result, Student> studentId;
    public static volatile SingularAttribute<Result, Integer> geography;
    public static volatile SingularAttribute<Result, Integer> physics;
    public static volatile SingularAttribute<Result, Integer> english;
    public static volatile SingularAttribute<Result, Exam> examId;
    public static volatile SingularAttribute<Result, Integer> id;
    public static volatile SingularAttribute<Result, Integer> math;
    public static volatile SingularAttribute<Result, Integer> meanGrade;
    public static volatile SingularAttribute<Result, Integer> computerStudies;
    public static volatile SingularAttribute<Result, Integer> meanMark;

}