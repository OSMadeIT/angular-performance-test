package com.osmadeit.angular.rest;

import com.osmadeit.angular.bean.StudentBean;
import com.osmadeit.angular.entities.Student;
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
@Path("/students")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StudentRest {
    @EJB
    StudentBean studentService; 
 
    @GET
    
    @Path("/list")
    public List<Student> findStudent(){
       List<Student> students = studentService.getStudent();
       return students;
    }
  
    @GET
    @Path("/{id}")
    public Student findAllStudent(@PathParam("id") int id){
       Student students = studentService.getStudentById(id);
       return students;
    }
    
    @POST
    @Path("/create")
    public Student saveStudent(Student student){
        studentService.createStudent(student);
        return student;
    }
    
    @Path("/update/{id}")
    @PUT
    public Student update(@PathParam("id") int id, Student editedStudent) {
        Student student = studentService.updateStudent(id, editedStudent);
        return student;
    }
    
    @DELETE
    @Path("/delete/{id}")
    public Student deleteStudent(@PathParam("id") int id){
       Student students = studentService.deleteStudent(id);
       return students;
    }
}
