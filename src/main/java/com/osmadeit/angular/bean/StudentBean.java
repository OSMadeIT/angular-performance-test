package com.osmadeit.angular.bean;

import com.osmadeit.angular.entities.Student;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author os
 */
@Stateless
public class StudentBean {
    @PersistenceContext
    EntityManager em;
    
    // get all students
    public List<Student> getStudent(){
        TypedQuery<Student> typedQuery = em.createQuery("SELECT m FROM Student m", Student.class);
        List<Student> students =  typedQuery.getResultList();
        return students;
    }
   
    // get student by id
    public Student getStudentById(int id){
        Student student = em.find(Student.class, id);
        return student;
    }
    
    // save student to db
    public Student createStudent(Student student){
        em.persist(student);
        em.flush();
        return student;
    } 
    
    public Student updateStudent(int id, Student studentNew) {
    Student student = em.find(Student.class, id);
    student.setRegNo(studentNew.getRegNo());
    student.setLastName(studentNew.getLastName()); 
    student.setFirstName(studentNew.getFirstName()); 
    em.persist(student);
    return student;
  }
    
    // delete student from DB
    public Student deleteStudent(int id){
        Student student = em.find(Student.class, id);
        em.remove(student);
        return student;
    }
}
