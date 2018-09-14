package com.osmadeit.angular.bean;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.osmadeit.angular.entities.Exam;
import javax.persistence.TypedQuery;

/**
 *
 * @author os
 */
@Stateless
public class ExamBean {
    @PersistenceContext
    EntityManager em;
    
    // get all exams
    public List<Exam> getExam(){
        TypedQuery<Exam> typedQuery = em.createQuery("SELECT m FROM Exam m", Exam.class);
        List<Exam> exams =  typedQuery.getResultList();
        return exams;
    }
   
    // get exam by id
    public Exam getExamById(int id){
        Exam exam = em.find(Exam.class, id);
        return exam;
    }
    
    // save exam to db
    public Exam createExam(Exam exam){
        em.persist(exam);
        em.flush();
        return exam;
    } 
    
    public Exam updateExam(int id, Exam examNew) {
    Exam exam = em.find(Exam.class, id);
    exam.setName(examNew.getName());
    em.persist(exam);
    return exam;
  }
    
    // delete exam from DB
    public Exam deleteExam(int id){
        Exam exam = em.find(Exam.class, id);
        em.remove(exam);
        return exam;
    }
}
