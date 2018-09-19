package com.osmadeit.angular.rest;

import com.osmadeit.angular.bean.ResultBean;
import com.osmadeit.angular.entities.Result;
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
@Path("/results")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ResultRest {
    @EJB
    ResultBean resultService; 
 
    @GET    
    @Path("/list")
    public List<Result> findResult(){
       List<Result> results = resultService.getResult();
       return results;
    }
  
    @GET
    @Path("/{id}")
    public Result findAllResult(@PathParam("id") int id){
       Result results = resultService.getResultById(id);
       return results;
    }
    
    @POST
    @Path("/create")
    public Result saveResult(Result result){
        resultService.createResult(result);
        return result;
    }
    
    @Path("/update/{id}")
    @PUT
    public Result update(@PathParam("id") int id, Result editedResult) {
        Result result = resultService.updateResult(id, editedResult);
        return result;
    }
    
    @DELETE
    @Path("/delete/{id}")
    public Result deleteResult(@PathParam("id") int id){
       Result results = resultService.deleteResult(id);
       return results;
    }
}
