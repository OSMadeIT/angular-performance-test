package com.osmadeit.angular.rest;

import com.osmadeit.angular.entities.Exam;
import com.osmadeit.angular.bean.ExamBean;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author os
 */
@Path("/exams")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ExamRest {
    @EJB
    ExamBean examService; 
 
    @GET
    @Path("/list")
    public List<Exam> findExam(){
       List<Exam> exams = examService.getExam();
       return exams;
    }
  
    @GET
    @Path("/{id}")
    public Exam findAllExam(@PathParam("id") int id){
       Exam exams = examService.getExamById(id);
       return exams;
    }
    
    @POST
    @Path("/create")
    public Exam saveExam(Exam exam){
        examService.createExam(exam);
        return exam;
    }
    
    @Path("/update/{id}")
    @PUT
    public Exam update(@PathParam("id") int id, Exam editedExam) {
        Exam exam = examService.updateExam(id, editedExam);
        return exam;
    }
    
    @DELETE
    @Path("/delete/{id}")
    public Exam deleteExam(@PathParam("id") int id){
       Exam exams = examService.deleteExam(id);
       return exams;
    }
}
